import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a qtd de códigos:");
        int n = sc.nextInt();

        int[] v = new int[n];
        int[] unicos = new int[n];
        int tamFinal = 0;

        System.out.println("Digite os códigos:");
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();

            boolean repetido = false;

            for (int j = 0; j < tamFinal; j++) {
                if (v[i] == unicos[j]) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                unicos[tamFinal] = v[i];
                tamFinal++;
            }
        }

        System.out.println("TamanhoFinal: " + tamFinal);

        System.out.print("Unicos: ");
        for (int i = 0; i < tamFinal; i++) {
            System.out.print(unicos[i] + " ");
        }

        sc.close();
    }
}