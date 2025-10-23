import java.util.Scanner;

public class TP01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fahrenheit1 = scanner.nextDouble(); 
        double fahrenheit2 = scanner.nextDouble();
        double fahrenheit3 = scanner.nextDouble();

        double celcius1 = fahrenheitToCelcius(fahrenheit1);
        double celcius2 = fahrenheitToCelcius(fahrenheit2);
        double celcius3 = fahrenheitToCelcius(fahrenheit3);

        double reamur1 = fahrenheitToReamur(fahrenheit1);
        double reamur2 = fahrenheitToReamur(fahrenheit2);
        double reamur3 = fahrenheitToReamur(fahrenheit3);

        System.out.printf("Celcius: %.1f %.1f %.1f\n", celcius1, celcius2, celcius3);
        System.out.printf("Reamur: %.2f %.2f %.2f\n", reamur1, reamur2, reamur3);

        scanner.close();
    }

    private static double fahrenheitToCelcius(double fahrenheit) { 
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    private static double fahrenheitToReamur(double fahrenheit) { 
        return (fahrenheit - 32) * 4.0 / 9.0;
    }
}