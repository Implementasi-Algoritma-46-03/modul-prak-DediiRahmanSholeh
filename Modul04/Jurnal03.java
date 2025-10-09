import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Dira = in.nextInt();
        int Radi = in.nextInt();
        int Idar = in.nextInt();

        if (Dira < Radi && Dira < Idar) {
            if (Radi < Idar) {
                System.out.println("Dira, Radi, Idar");
            } else if (Idar < Radi) {
                System.out.println("Radi, Idar, Dira");
            } else if (Idar < Dira) {
                System.out.println("Idar, Dira, Radi");
            } else {
                System.out.println("Dira, Radi, Idar");
            }
        }
    }
}