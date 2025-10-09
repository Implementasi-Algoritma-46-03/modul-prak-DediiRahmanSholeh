import java.util.Scanner;

public class Jurnal02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        double pajak = 0;
        if (N <= 50) {
            pajak = N * 1000000 * 0.05;
            System.out.println("Penghasilan kotor = " + N + " juta Rupiah");
            System.out.println("Pajak 5% = Rp. " + (int) pajak);
            System.out.println("Penghasilan bersih = Rp. " + (int) (N * 1000000 - pajak));
        }

        else if (N <= 500) {
            pajak = N * 1000000 * 0.15;
            System.out.println("Penghasilan kotor = " + N + " juta Rupiah");
            System.out.println("Pajak 15% = Rp. " + (int) pajak);
            System.out.println("Penghasilan bersih = Rp. " + (int) (N * 1000000 - pajak));
        } else if (N > 500) {
            pajak = N * 1000000 * 0.30;
            System.out.println("Penghasilan kotor = " + N + " juta Rupiah");
            System.out.println("Pajak 30% = Rp. " + (int) pajak);
            System.out.println("Penghasilan bersih = Rp. " + (int) (N * 1000000 - pajak));
        }

    }
}