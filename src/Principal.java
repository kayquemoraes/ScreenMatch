import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

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

        Serie theBoys = new Serie();
        theBoys.setNome("The Boys");
        theBoys.setAnoDeLancamento(2019);
        theBoys.setTemporadas(3);
        theBoys.setEpisodiosPorTemporada(10);
        theBoys.setMinutosPorEpisodio(50);
        System.out.println(theBoys.getDuracaoEmMinutos());
        theBoys.setDuracaoEmMinutos();
        theBoys.exibeFicha();

        Filme outroFilme = new Filme();
        outroFilme.setNome("Ilha do medo");
        outroFilme.setAnoDeLancamento(2010);
        outroFilme.setDuracaoEmMinutos(138);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(theBoys);
        System.out.println(calculadora.getTempoTotal());
    }
}
