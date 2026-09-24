import java.util.Scanner;

class AgendaSemanal {

    private int[][] agenda;

    public AgendaSemanal(int[][] agenda) {
        this.agenda = agenda;
    }

    public int horariosLivres() {
        int total = 0;

        for (int i = 0; i < agenda.length; i++) {
            for (int j = 0; j < agenda[i].length; j++) {
                if (agenda[i][j] == 0) {
                    total++;
                }
            }
        }

        return total;
    }
}

public class Exerc10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] agenda = new int[5][8];

        System.out.println("Digite a agenda:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                agenda[i][j] = sc.nextInt();
            }
        }

        AgendaSemanal semana = new AgendaSemanal(agenda);

        System.out.println("Horarios livres: "
                + semana.horariosLivres());

        sc.close();
    }
}