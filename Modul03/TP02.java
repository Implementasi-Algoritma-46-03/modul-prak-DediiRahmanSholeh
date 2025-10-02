import java.util.Scanner;

import java.util.Scanner;
public class TP02 {

    public static void main(String[] args) {
        Scanner tugas2 = new Scanner(System.in);
         // Kerjakan soalnya di sini

        String nama = tugas2.next();
        int jumlah = tugas2.nextInt();
        int harga = tugas2.nextInt();

        int total = harga * jumlah;

        System.out.println("Hi, " + nama + ". Total belanja adalah " + total + " rupiah.");

        tugas2.close();
    }
}