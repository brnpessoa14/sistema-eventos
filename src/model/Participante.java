package model;

public class Participante {
    private String nome;
    private String cpf;
    private String email;
    private String curso;

    public Participante(String nome, String cpf, String email, String curso) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getCurso() {
        return curso;
    }

    public String informarDados() {
        return "Participante: " + nome + " - curso: " + curso;
    }
}
