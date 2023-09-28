public class Filme {
    // Atributos
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    int duracaoEmMinutos;

    // Métodos
    void exibeFicha() {
        System.out.println(String.format("""
                Filme: %s
                Ano de lançamento: %d
                Duração: %d minutos
                """, nome, anoDeLancamento, duracaoEmMinutos));
    }

    void avaliaFilme(double nota) {
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double calculaMedia() {
        return somaAvaliacoes / totalAvaliacoes;
    }

    int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }
}
