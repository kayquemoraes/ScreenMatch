public class Principal {
    public static void main(String[] args) {

        // Instanciar objeto
        Filme meuFilme = new Filme();

        // Atribuir valores ao objeto "meuFilme" com base nos atributos da classe "Filme"
        meuFilme.nome = "Efeito borboleta";
        meuFilme.anoDeLancamento = 2004;
        meuFilme.duracaoEmMinutos = 120;

        meuFilme.exibeFicha();

        meuFilme.avaliaFilme(6);
        meuFilme.avaliaFilme(7);
        meuFilme.avaliaFilme(10);
        System.out.println(meuFilme.somaAvaliacoes);
        System.out.println(meuFilme.totalAvaliacoes);

        System.out.println(String.format("Média das avaliações: %.2f", meuFilme.calculaMedia()));
    }
}
