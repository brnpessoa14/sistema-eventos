package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Evento {
    private String titulo;
    private String data;
    private int duracaoHoras;
    private double orcamento;
    private Local local;
    private List<Participante> participantes = new ArrayList<>();

    public Evento(String titulo, String data, int duracaoHoras, double orcamento, Local local) {
        this.titulo = titulo;
        this.data = data;
        this.duracaoHoras = duracaoHoras;
        this.orcamento = orcamento;
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getData() {
        return data;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public Local getLocal() {
        return local;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public boolean inscrever(Participante p) {
        if (p == null || local == null) {
            return false;
        }
        if (participantes.size() < local.getCapacidade()) {
            participantes.add(p);
            return true;
        }
        return false;
    }

    public String descricaoBasica() {
        String infoLocal = local != null ? local.descricaoBasica() : "Local não definido";
        return titulo + " - " + data + " (" + duracaoHoras + "h) - " + infoLocal;
    }
}
