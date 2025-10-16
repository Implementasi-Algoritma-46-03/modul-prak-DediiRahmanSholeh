import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner inputScanner = new Scanner(System.in);
        
        int jumlahUang = inputScanner.nextInt();
        int jumlahLembar = jumlahUang / 1000;
        System.out.println(jumlahLembar);
        int sisaUang = jumlahUang % 1000;
        System.out.println(sisaUang);
        
    }
}