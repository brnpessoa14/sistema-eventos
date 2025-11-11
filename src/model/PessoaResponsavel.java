package model;

public abstract class PessoaResponsavel {
    private String nome;
    private String email;

    public PessoaResponsavel(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String identificar() {
        return nome + " - e-mail: " + email;
    }
}
