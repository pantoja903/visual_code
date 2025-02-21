import java.util.*;
import java.lang.Math;

class Sesi2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Consultar o salário");

        // Declaração Variáveis
        double s;
        String n;

        // Entradas
        System.out.println("Informe seu nome ");
        n = input.nextLine();
        System.out.println("Informe o salário R$ ");
        s = input.nextDouble();
        if (s >= 5000) {
            System.out.println("pagará a taxa de 20% ");
            System.out.println(s - s * 0.8);
        } else {
            System.out.println("Não pagará a taxa de 20% ");
        }
    }
}
