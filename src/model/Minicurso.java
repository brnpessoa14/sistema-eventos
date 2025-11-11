package model;

import java.util.List;

public class Minicurso extends Evento {
    private List<Instrutor> instrutores;
    private int cargaHoraria;

    public Minicurso(String titulo, String data, int duracaoHoras, double orcamento, Local local, List<Instrutor> instrutores, int cargaHoraria) {
        super(titulo, data, duracaoHoras, orcamento, local);
        this.instrutores = instrutores;
        this.cargaHoraria = cargaHoraria;
    }

    public List<Instrutor> getInstrutores() {
        return instrutores;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String descricaoCompleta() {
        String nomes = "";
        if (instrutores != null) {
            for (int i = 0; i < instrutores.size(); i++) {
                Instrutor instrutor = instrutores.get(i);
                if (instrutor != null) {
                    if (!nomes.isEmpty()) {
                        nomes += ", ";
                    }
                    nomes += instrutor.getNome();
                }
            }
        }
        if (nomes.isEmpty()) {
            nomes = "instrutores não informados";
        }
        return "Minicurso: " + descricaoBasica() + " - carga horária: " + cargaHoraria + "h - " + nomes;
    }
}
