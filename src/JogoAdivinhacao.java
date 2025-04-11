import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = random.nextInt(101);
        int tentativas = 0;
        int tentativasMax = 3;

        System.out.println("Bem vindo ao Jogo de Adivinhação! :)");
        System.out.println("Adivinhe qual o número escolhido. Entre 0 e 10.");
        System.out.println("Você possui " + tentativasMax + " tentativas.");

        while (tentativas < tentativasMax){
            System.out.println("Tentativa " + (tentativas + 1) + ": ");
            int palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroSecreto){
                System.out.println("\uD83C\uDF89 Parabéns! Você adivinhou o número em " + tentativas + " tentativas!");
                break;
            } else if (palpite < numeroSecreto){
                System.out.println("O número é maior que " + palpite + ". Tente novamente." );
            } else {
                System.out.println("O número é menor que " + palpite + ". Tente novamente.");
            }
            if (tentativas == tentativasMax){
                System.out.println("Suas tentativas acabaram, o número secreto era " + numeroSecreto + ". Boa sorte da próxima vez!");
            }
        }
        scanner.close();
    }
}
