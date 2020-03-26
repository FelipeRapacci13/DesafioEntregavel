package Entregavel;

import java.util.ArrayList;

public class Curso {

    private String nomeCurso;
    private int codigoCurso;
    private ProfessorTitular ProfessorTitular;
    private ProfessorAdjunto ProfessorAdjunto;
    private int quantidadeMaximaDeAlunos;
    private ArrayList<Aluno> alunosCurso;

    public Curso(){};
    public Curso(String nome,int codigoCurso,ProfessorTitular professorTitular,ProfessorAdjunto professorAdjunto,int quantidadeMaximaDeAlunos,ArrayList<Aluno> alunosCurso){
        this.nomeCurso = nome;
        this.codigoCurso = codigoCurso;
        this.ProfessorTitular = ProfessorTitular;
        this.ProfessorAdjunto = ProfessorAdjunto;
        this.quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos;
        this.alunosCurso = alunosCurso;

    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public ProfessorTitular getProfessorTitular() {
        return ProfessorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        ProfessorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return ProfessorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        ProfessorAdjunto = professorAdjunto;
    }

    public int getQuantidadeMaximaDeAlunos() {
        return quantidadeMaximaDeAlunos;
    }

    public void setQuantidadeMaximaDeAlunos(int quantidadeMaximaDeAlunos) {
        this.quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos;
    }

    public ArrayList<Aluno> getAlunosCurso() {
        return alunosCurso;
    }

    public void setAlunosCurso(ArrayList<Aluno> alunosCurso) {
        this.alunosCurso = alunosCurso;
    }

    public boolean verificarCurso(int codigoDoCursoNovo) {
        int codigoCurso = this.getCodigoCurso();
        if (this.getCodigoCurso() == codigoDoCursoNovo) {
            return true;
        } else {
            return false;
        }
    }

    public boolean adicionarAluno(Aluno novoAluno) {
        int quantidadeDeAlunoNoCurso = this.alunosCurso.size();
        int quantidadeMaximaNoCurso = this.getQuantidadeMaximaDeAlunos();
        if (quantidadeDeAlunoNoCurso >= quantidadeMaximaNoCurso) {
            return false;
        } else {
            this.alunosCurso.add(novoAluno);
            return true;
        }
    }

    public void excluirAluno(Aluno alunoDesistente) {
        for (Aluno index : this.alunosCurso) ;
        System.out.println("Aluno não encontrado !");
    }
}





