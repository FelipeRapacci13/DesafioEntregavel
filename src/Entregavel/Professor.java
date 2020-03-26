package Entregavel;

public class Professor {

    private String nome;
    private String sobrenome;
    private int tempoDeCasa;
    private int codigoDeProfessor;

    public Professor() {};

    public Professor(String nome, String sobrenome, int tempoDeCasa, int codigoDeProfessor) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempoDeCasa = tempoDeCasa;
        this.codigoDeProfessor = codigoDeProfessor;
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

    public int getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(int tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public int getCodigoDeProfessor() {
        return codigoDeProfessor;
    }

    public void setCodigoDeProfessor(int codigoDeProfessor) {
        this.codigoDeProfessor = codigoDeProfessor;
    }



    public boolean verificarProfessor(int codigoDeProfessorNovo) {
        int codigoDeProfessor = this.codigoDeProfessor;
        if (codigoDeProfessor == codigoDeProfessorNovo) {
            return false;
        } else {
            return true;
        }
    }
}

