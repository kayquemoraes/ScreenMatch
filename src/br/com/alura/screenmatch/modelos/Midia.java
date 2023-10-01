package br.com.alura.screenmatch.modelos;

public class Midia {
    // Atributos
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

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

    // Getters
    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }
}
