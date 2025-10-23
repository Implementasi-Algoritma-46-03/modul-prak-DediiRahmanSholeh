import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
    Scanner tugass = new Scanner(System.in);
    int N = tugass.nextInt();

        double diskon = 0;
        if (N > 200000) {
            diskon = N * 0.05;
        }

        double totalSetelahDiskon = N - diskon;
        double ppn = totalSetelahDiskon * 0.11;
        double totalDibayar = totalSetelahDiskon + ppn;

        System.out.println("Transaksi = " + N);

        if (diskon > 0) {
            System.out.println("Total = " + N + " - " + diskon);
        } else {
            System.out.println("Total = " + N);
        }

        System.out.println("Ppn 11% = " + ppn);
        System.out.println("Total dibayar = " + totalDibayar);
    }
}