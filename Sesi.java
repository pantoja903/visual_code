import java.util.*;
import java.lang.Math;

public class Sesi {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Sistema de informação do Sesi
        // Declarção de variáveis
        String nome;
        int nota;

        // Entrada
        System.out.println("Informar o nome do estudante ");
        nome = input.nextLine();
        System.out.println("informar a nota do estudante ");
        nota = input.nextInt();

        // Processamento
        if (nota >= 50) {

            // Saida
            System.out.println("parabens você foi aprovado ");
        } else {

            // Saida
            System.out.println("que pena você foireprovado ");
        }
    }
}
