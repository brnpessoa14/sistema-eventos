package model;

public class Sala extends Local {
    private int numero;
    private boolean temMultimidia;

    public Sala(String nome, int capacidade, String bloco, int numero, boolean temMultimidia) {
        super(nome, capacidade, bloco);
        this.numero = numero;
        this.temMultimidia = temMultimidia;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isTemMultimidia() {
        return temMultimidia;
    }

    public String informarDados() {
        String recurso = temMultimidia ? "com multimídia" : "sem multimídia";
        return "Sala " + numero + " - " + descricaoBasica() + " - " + recurso;
    }
}
