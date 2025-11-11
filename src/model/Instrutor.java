package model;

public class Instrutor extends PessoaResponsavel {
    private String formacao;
    private String especializacao;

    public Instrutor(String nome, String email, String formacao, String especializacao) {
        super(nome, email);
        this.formacao = formacao;
        this.especializacao = especializacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public String informarDados() {
        return "Instrutor: " + getNome() + " - formação: " + formacao + " - especialização: " + especializacao;
    }
}
