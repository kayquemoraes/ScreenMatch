package br.com.alura.screenmatch.modelos;

public class Filme {
    // Atributos
    public String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    int duracaoEmMinutos;

    // Métodos
    public void exibeFicha() {
        System.out.println(String.format("""
                Filme: %s
                Ano de lançamento: %d
                Duração: %d minutos
                """, nome, anoDeLancamento, duracaoEmMinutos));
    }

    public void avaliaFilme(double nota) {
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double calculaMedia() {
        return somaAvaliacoes / totalAvaliacoes;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }
}
