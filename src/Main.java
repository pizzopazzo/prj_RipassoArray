import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vettore = {1, 2, 3};
        int[] vettore2 = new int[10];
        int[] vettore3;
        vettore3 = new int[10];

        for (int i = 0; i < vettore2.length; i++){

            System.out.print("Inserisci il " + (i + 1) + " numero: ");
            vettore2[i] = in.nextInt();
        }
    }
}