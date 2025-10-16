import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
    Scanner tugas = new Scanner(System.in);

    int N = tugas.nextInt();
    if (N % 6 == 0) {
        System.out.println("Kelipatan enam");
    } else {
        System.out.println("Bukan kelipatan enam");
    }

    }
}
