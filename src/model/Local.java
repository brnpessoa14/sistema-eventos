package model;

/**
 * Representa um local genérico do evento (sala, auditório, laboratório).
 */
public abstract class Local {
    private String nome;
    private int capacidade;
    private String bloco;

    public Local(String nome, int capacidade, String bloco) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.bloco = bloco;
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public String getBloco() {
        return bloco;
    }

    public String descricaoBasica() {
        return nome + " - bloco " + bloco + " - capacidade " + capacidade;
    }
}
