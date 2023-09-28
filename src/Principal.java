import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {

        // Instanciar objeto
        Filme meuFilme = new Filme();

        // Atribuir valores ao objeto "meuFilme" com base nos atributos da classe "br.com.alura.screenmatch.modelos.Filme"
        meuFilme.setNome("Efeito borboleta");
        meuFilme.setAnoDeLancamento(2004);
        meuFilme.setDuracaoEmMinutos(120);
        meuFilme.exibeFicha();

        meuFilme.avaliaFilme(6);
        meuFilme.avaliaFilme(7);
        meuFilme.avaliaFilme(10);
        System.out.println(meuFilme.getTotalAvaliacoes());

        System.out.println(String.format("Média das avaliações: %.2f", meuFilme.calculaMedia()));
    }
}
