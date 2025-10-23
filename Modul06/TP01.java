import java.util.Scanner;

public class TP01 {

    private static double toCelcius(double f) {
        return (f - 32) * 5 / 9;
    }

    private static double toReamur(double f) {
        return (f - 32) * 4 / 9;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r1 = input.nextDouble();
        double r2 = input.nextDouble();
        double r3 = input.nextDouble();

        System.out.printf("%.2f %.2f %.2f%n", toCelcius(r1), toCelcius(r2), toCelcius(r3));
        System.out.printf("%.2f %.2f %.2f%n", toReamur(r1), toReamur(r2), toReamur(r3));
    }
}