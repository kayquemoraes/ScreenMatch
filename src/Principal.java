public class Principal {
    public static void main(String[] args) {

        // Instanciar objeto
        Filme meuFilme = new Filme();

        // Atribuir valores ao objeto "meuFilme" com base nos atributos da classe "Filme"
        meuFilme.nome = "Efeito borboleta";
        meuFilme.anoDeLancamento = 2004;
        meuFilme.duracaoEmMinutos = 120;

        System.out.println(String.format("""
                Filme: %s
                Ano de lançamento: %d
                Duração: %d minutos
                """, meuFilme.nome, meuFilme.anoDeLancamento, meuFilme.duracaoEmMinutos));
    }
}
