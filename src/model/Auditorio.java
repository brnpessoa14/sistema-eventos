package model;

public class Auditorio extends Local {
    private boolean sistemaSom;
    private boolean traducaoSimultanea;

    public Auditorio(String nome, int capacidade, String bloco, boolean sistemaSom, boolean traducaoSimultanea) {
        super(nome, capacidade, bloco);
        this.sistemaSom = sistemaSom;
        this.traducaoSimultanea = traducaoSimultanea;
    }

    public boolean temSistemaSom() {
        return sistemaSom;
    }

    public boolean temTraducaoSimultanea() {
        return traducaoSimultanea;
    }

    public String informarDados() {
        String som = sistemaSom ? "com som" : "sem som";
        String traducao = traducaoSimultanea ? "com tradução" : "sem tradução";
        return "Auditório " + getNome() + " - bloco " + getBloco() + " - capacidade " + getCapacidade() + " - " + som + ", " + traducao;
    }
}
