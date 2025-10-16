import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();

        double rataRata = (n1 + n2 + n3) / 3.0;

        System.out.printf("Nilai rata-rata: %.2f%n", rataRata);
        
    }
}