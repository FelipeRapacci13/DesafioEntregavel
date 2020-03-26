package Entregavel;

import java.util.Date;

class Matricular {

    public Curso curso;
    public Aluno aluno;
    public Date dataDeMatricula;

    public Matricular() {

    };

    public Matricular(Aluno aluno, Curso curso) {

        this.aluno = aluno;
        this.curso = curso;
        this.dataDeMatricula = new Date();
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Date getDataDeMatricula() {
        return dataDeMatricula;
    }

    public void setDataDeMatricula(Date dataDeMatricula) {
        this.dataDeMatricula = dataDeMatricula;
    }
}


