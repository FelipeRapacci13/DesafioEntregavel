package Entregavel;

public class Aluno {

    private String nome;
    private String sobrenome;
    private int codigoDeAluno;

    public Aluno() {};

    public Aluno (String nome, String sobrenome, int codigoDeAluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigoDeAluno = codigoDeAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getCodigoDeAluno() {
        return codigoDeAluno;
    }

    public void setCodigoDeAluno(int codigoDeAluno) {
        this.codigoDeAluno = codigoDeAluno;
    }

    public boolean verificarAluno(int codigoProcura) {
        int codigoDeAluno = this.codigoDeAluno;
        if (codigoDeAluno == codigoProcura) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getCodigoAluno() {
        return false;
    }
}





