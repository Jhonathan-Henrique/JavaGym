public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Interestelar");

    int anoDeLancamento = 2014;
    double notaDoFilme = 8.7;
    boolean disponivel = true;
    String sinopse;
    sinopse = """
            Uma equipe de exploradores viaja através de um buraco de minhoca no espaço, 
            na tentativa de garantir a sobrevivência da humanidade.
            Ano de Lançamento :""" + anoDeLancamento;

        System.out.println(sinopse);


    }
}