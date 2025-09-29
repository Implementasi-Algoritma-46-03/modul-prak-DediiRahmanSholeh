import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
         Scanner inputScanner = new Scanner(System.in);

        // input
        String namaPembeli = inputScanner.next();
        int jumlahBarang = inputScanner.nextInt();
        int hargaPerBarang = inputScanner.nextInt();

        int totalBelanja = jumlahBarang * hargaPerBarang;

        // output
        System.out.println("Hi, " + namaPembeli + ". Total belanja adalah " + totalBelanja + " rupiah.");

        inputScanner.close();
    }
}
