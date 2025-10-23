import java.util.Scanner;

public class Jurnal01 {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        int N = angka.nextInt();

        
        if (24 % N == 0 && 56 % N == 0) {
            System.out.println("Faktor dari 24 dan 56");
        } else {
            System.out.println("Bukan faktor dari 24 dan 56");
        }
    }
}