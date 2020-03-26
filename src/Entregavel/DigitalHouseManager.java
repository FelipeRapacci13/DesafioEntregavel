package Entregavel;

import java.util.ArrayList;

public class DigitalHouseManager {

    private ArrayList<Aluno> alunoDH = new ArrayList<>();
    private ArrayList<Professor> professorDH = new ArrayList<>();
    private ArrayList<Curso> cursoDH = new ArrayList<>();
    private ArrayList<Matricular> matriculaDH = new ArrayList<Matricular>();

    public ArrayList<Aluno> getAlunoDH() {
        return alunoDH;
    }

    public void setAlunoDH(ArrayList<Aluno> alunoDH) {
        this.alunoDH = alunoDH;
    }

    public ArrayList<Professor> getProfessoreDH() {
        return professorDH;
    }

    public void setProfessoreDH(ArrayList<Professor> professoreDH) {
        this.professorDH = professoreDH;
    }

    public ArrayList<Curso> getCursoDH() {
        return cursoDH;
    }

    public void setCursoDH(ArrayList<Curso> cursoDH) {
        this.cursoDH = cursoDH;
    }

    public ArrayList<Matricular> getMatriculaDH() {
        return matriculaDH;
    }

    public void setMatriculaDH(ArrayList<Matricular> matriculaDH) {
        this.matriculaDH = matriculaDH;
    }

    public void registrarCurso(String nome, int codigoCurso, int quantidadeMaximaDeAlunos) {
        Curso novoCurso = new Curso();
        novoCurso.setNomeCurso(nome);
        novoCurso.setCodigoCurso(codigoCurso);
        novoCurso.setQuantidadeMaximaDeAlunos(quantidadeMaximaDeAlunos);
        this.cursoDH.add(novoCurso);
    }

    public void excluirCurso(int codigoExcluir) {
        for (Curso indexCurso : this.cursoDH) {
            int codigoIndexCurso = indexCurso.getCodigoCurso();
            if (codigoIndexCurso == codigoExcluir) {
                this.cursoDH.remove(indexCurso);
            }
            break;
        }
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, int tempoDeCasa, int codigoDeProfessor, int quantidadeDeHorasMonitoria) {
        ProfessorAdjunto professorNovo = new ProfessorAdjunto();
        professorNovo.setNome(nome);
        professorNovo.setSobrenome(sobrenome);
        professorNovo.setTempoDeCasa(tempoDeCasa);
        professorNovo.setCodigoDeProfessor(codigoDeProfessor);
        professorNovo.setQuantidadeDeHorasMonitoria(quantidadeDeHorasMonitoria);
        this.professorDH.add(professorNovo);
    }

    public void registrarProfessorTitular(String nome, String sobrenome, int tempoDeCasa, int codigoDeProfessor, String especialidade) {
        ProfessorTitular professorNovo = new ProfessorTitular();
        professorNovo.setNome(nome);
        professorNovo.setSobrenome(sobrenome);
        professorNovo.setTempoDeCasa(tempoDeCasa);
        professorNovo.setCodigoDeProfessor(codigoDeProfessor);
        professorNovo.setEspecialidade(especialidade);
        this.professorDH.add(professorNovo);
    }

    public void excluirProfessor(int codigoExcluir) {
        for (Professor indexProfessores : this.professorDH) {
            int codigoIndexProfessores = indexProfessores.getCodigoDeProfessor();
            if (codigoIndexProfessores == codigoExcluir) {
                this.professorDH.remove(indexProfessores);
            }
        }

        int CursoAchado = 0;
        Aluno AlunoAchado = null;

        for (Curso indexCursoDaLista : this.cursoDH) {
            if (indexCursoDaLista.getCodigoCurso() == CursoAchado) {
                CursoAchado = this.cursoDH.indexOf(indexCursoDaLista);
                break;
            }
        }
    }

    public void matricularAluno(String nome, String sobrenome, int codigoDeMatricula, int codigoDeAluno, int codigoDoCurso) {
        this.alunoDH.add(new Aluno(nome, sobrenome, codigoDeMatricula));
        {
        }
        int CursoAchado = 0;
        Aluno AlunoAchado = null;

        for (Curso indexCursoDaList:
             this.cursoDH)
            if (getIndexAlunoDaLista(AlunoAchado).getCodigoDeAluno() == codigoDeAluno) {
                AlunoAchado = getIndexAlunoDaLista(AlunoAchado);
                break;
            }


        if (this.cursoDH.get(CursoAchado).adicionarAluno(AlunoAchado)) {
            System.out.println("Matrícula não realizada, falta de vaga.");
        } else {
            Curso cursoDesejado = cursoDH.get(CursoAchado);
            this.matriculaDH.add(new Matricular(AlunoAchado, cursoDesejado));
            System.out.println("Matrícula realizada !");
        }
    }

    private Aluno getIndexAlunoDaLista(Aluno indexAlunoDaLista) {
        return indexAlunoDaLista;
    }


    public void alocarProfessores(int codigoDeCurso, int codigoProfessorTitular, int codigoProfessorAdjunto) {

        int CursoAchado = 0;
        Professor TitularAchado = null;
        Professor AdjuntoAchado = null;

        for (Curso indexcursoDaLista : this.cursoDH) {
            if (indexcursoDaLista.getCodigoCurso() == codigoDeCurso) {
                CursoAchado = this.cursoDH.indexOf(indexcursoDaLista);
                break;
            }
        }
        for (Professor indexProfessorLista : this.professorDH) {
            if (indexProfessorLista.getCodigoDeProfessor() == codigoProfessorTitular) {
                TitularAchado = indexProfessorLista;
                this.cursoDH.get(CursoAchado).setProfessorTitular((ProfessorTitular) TitularAchado);
            } else if (indexProfessorLista.getCodigoDeProfessor() == codigoProfessorAdjunto) {
                AdjuntoAchado = indexProfessorLista;
                this.cursoDH.get(CursoAchado).setProfessorAdjunto((ProfessorAdjunto) AdjuntoAchado);

            }
        }
    }
}


