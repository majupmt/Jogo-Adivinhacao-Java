import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
            totalDeNotas++;
        }

        double media = mediaAvaliacao / totalDeNotas;
        System.out.printf("Média de avaliações: %.1f%n", media);
    }
}
