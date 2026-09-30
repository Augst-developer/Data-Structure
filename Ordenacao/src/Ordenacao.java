public class Ordenacao {

    public static void ordena(int[] A, int n) {
        if (n > 1) {
            int max, j, aux;

            max = n - 1;

            for (j = n - 2; j >= 0; j--) {
                if (A[j] > A[max]) {
                    max = j;
                }
            }

            aux = A[max];
            A[max] = A[n - 1];
            A[n - 1] = aux;

            ordena(A, n - 1);
        }
    }

    public static void main(String[] args) {
        int[] A = {8, 7, 2, 4, 9, 1};

        ordena(A, A.length);

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}