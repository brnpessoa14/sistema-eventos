package model;

public class Laboratorio extends Local {
    private int computadores;
    private String tipo;

    public Laboratorio(String nome, int capacidade, String bloco, int computadores, String tipo) {
        super(nome, capacidade, bloco);
        this.computadores = computadores;
        this.tipo = tipo;
    }

    public int getComputadores() {
        return computadores;
    }

    public String getTipo() {
        return tipo;
    }

    public String informarDados() {
        return "Laboratório de " + tipo + " - " + descricaoBasica() + " - computadores: " + computadores;
    }
}
