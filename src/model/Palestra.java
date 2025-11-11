package model;

public class Palestra extends Evento {
    private String palestrante;
    private String instituicao;

    public Palestra(String titulo, String data, int duracaoHoras, double orcamento, Local local, String palestrante, String instituicao) {
        super(titulo, data, duracaoHoras, orcamento, local);
        this.palestrante = palestrante;
        this.instituicao = instituicao;
    }

    public String getPalestrante() {
        return palestrante;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public String descricaoCompleta() {
        return "Palestra: " + descricaoBasica() + " - palestrante: " + palestrante + " - instituição: " + instituicao;
    }
}
