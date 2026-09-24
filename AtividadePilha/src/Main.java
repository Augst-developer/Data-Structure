import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma expressão:");
        String expressao = scanner.nextLine();

        boolean resultado = Validador.validarBalanceamento(expressao);

        if (resultado) {
            System.out.println("Expressão balanceada corretamente.");
        } else {
            System.out.println("Expressão com delimitadores incorretos.");
        }

        scanner.close();
    }
}