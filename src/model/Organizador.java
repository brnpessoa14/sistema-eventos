package model;

public class Organizador extends PessoaResponsavel {
    private String funcao;

    public Organizador(String nome, String email, String funcao) {
        super(nome, email);
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public String informarDados() {
        return "Organizador: " + getNome() + " - função: " + funcao;
    }
}
