import java.util.Scanner;
public class TP02 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int hasil = (4 + n) % 7;

        String hari = "";
        switch (hasil) {
            case 0: hari = "lundi"; break;
            case 1: hari = "mardi"; break;
            case 2: hari = "mercredi"; break;
            case 3: hari = "jeudi"; break;
            case 4: hari = "vendredi"; break;
            case 5: hari = "samedi"; break;
            case 6: hari = "dimanche"; break;
        }

        System.out.println(hari);
    }
}
