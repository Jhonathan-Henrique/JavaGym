import java.util.Scanner;

public class outroLoop {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Sua avaliação do filme ou -1 para encerrar");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
            totalDeNotas++;
        }

        System.out.println(mediaAvaliacao / totalDeNotas);
    }
}
