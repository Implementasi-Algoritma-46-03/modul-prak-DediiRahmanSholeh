import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        double P = input.nextDouble();
        double A = input.nextDouble();
        double B = input.nextDouble();

        double NA = 0.25 * P + 0.35 * A + 0.40 * B;

        System.out.printf("%.2f%n", NA);

        boolean lulus = NA >= 75;
        System.out.println("Lulus MK: " + (lulus ? "true" : "false"));
        
    }
}
