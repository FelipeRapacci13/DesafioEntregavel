package Entregavel;

public class ProfessorAdjunto extends Professor {

    private int quantidadeDeHorasMonitoria;

    public ProfessorAdjunto() {
        super();
    }


    public void ProfessorAdjunto(){};

    public ProfessorAdjunto(String nome, String sobrenome, int tempoDeCasa, int codigoDeProfessor, int quantidadeDeHorasMonitoria) {
        super(nome, sobrenome, tempoDeCasa, codigoDeProfessor);
        this.quantidadeDeHorasMonitoria = quantidadeDeHorasMonitoria;
    }

    public int getQuantidadeDeHorasMonitoria() {
        return quantidadeDeHorasMonitoria;
    }

    public void setQuantidadeDeHorasMonitoria(int quantidadeDeHorasMonitoria) {
        this.quantidadeDeHorasMonitoria = quantidadeDeHorasMonitoria;
    }
}
