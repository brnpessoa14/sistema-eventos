package model;

public class Seminario extends Evento {
    private String tema;
    private String apresentador;
    private String orientador;

    public Seminario(String titulo, String data, int duracaoHoras, double orcamento, Local local, String tema, String apresentador, String orientador) {
        super(titulo, data, duracaoHoras, orcamento, local);
        this.tema = tema;
        this.apresentador = apresentador;
        this.orientador = orientador;
    }

    public String getTema() {
        return tema;
    }

    public String getApresentador() {
        return apresentador;
    }

    public String getOrientador() {
        return orientador;
    }

    public String descricaoCompleta() {
        return "Seminário: " + descricaoBasica() + " - tema: " + tema + " - apresentador: " + apresentador + " - orientador: " + orientador;
    }
}
