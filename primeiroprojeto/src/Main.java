public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Interestelar");

    int anoDeLancamento = 2014;
    double notaDoFilme = 8.7;
    boolean disponivel = true;
    double media = (9.8 + 6.3 + 8.0) / 3;
    String sinopse;
    sinopse = """
            Uma equipe de exploradores viaja através de um buraco de minhoca no espaço, 
            na tentativa de garantir a sobrevivência da humanidade.
            Ano de Lançamento :""" + anoDeLancamento;

        System.out.println(sinopse);

        int classificacao = (int) media / 2;
        System.out.println(classificacao);

    }
}