import java.util.Scanner;

public class Jurnal02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lirik = sc.nextLine();

        char vokalPengganti = tentukanVokal(lirik.length());
        String hasil = ubahHuruf(lirik, vokalPengganti);

        System.out.println(hasil);
    }

    static char tentukanVokal(int panjang) {
        int sisa = panjang % 5;
        if (sisa == 0)
            return 'a';
        else if (sisa == 1)
            return 'e';
        else if (sisa == 2)
            return 'i';
        else if (sisa == 3)
            return 'o';
        else if (sisa == 4)
            return 'u';
        else
            return 'a';
    }

    static String ubahHuruf(String lirik, char vokal) {
        return lirik.replaceAll("[AaEeIiOoUu]", String.valueOf(vokal));
    }

}