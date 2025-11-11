import java.util.Arrays;
import model.*;

public class Programa {
    public static void main(String[] args) {
        Sala sala = new Sala("Sala de Aula", 30, "Bloco A", 101, true);
        Auditorio auditorio = new Auditorio("Auditório Central", 100, "Bloco B", true, true);
        Laboratorio lab = new Laboratorio("Lab Computação", 20, "Bloco C", 15, "Informática");

        Participante p1 = new Participante("João", "12345678900", "joao@email.com", "Engenharia");
        Participante p2 = new Participante("Maria", "98765432100", "maria@email.com", "Sistemas");

        Instrutor i1 = new Instrutor("Carlos", "carlos@uni.edu", "Mestrado", "IA");
        Instrutor i2 = new Instrutor("Ana", "ana@uni.edu", "Doutorado", "Banco de Dados");

        Palestra palestra = new Palestra("Tendências de IA", "10/11/2025", 2, 1500.0, auditorio, "Dr. Silva", "TechCorp");
        Minicurso minicurso = new Minicurso("Introdução ao Java", "12/11/2025", 4, 2000.0, sala, Arrays.asList(i1, i2), 8);
        Seminario seminario = new Seminario("Pesquisa em Computação", "15/11/2025", 3, 1000.0, lab, "Redes Neurais", "Pedro", "Prof. João");

        palestra.inscrever(p1);
        minicurso.inscrever(p2);
        seminario.inscrever(p1);
        seminario.inscrever(p2);

    System.out.println(palestra.descricaoCompleta());
    System.out.println(minicurso.descricaoCompleta());
    System.out.println(seminario.descricaoCompleta());
    }
}
