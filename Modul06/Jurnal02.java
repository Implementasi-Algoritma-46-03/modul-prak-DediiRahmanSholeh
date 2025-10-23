import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        
        String lirik = input.nextLine();
        int panjang = lirik.length();
        int sisa = panjang % 5;

        char hurufPengganti = tentukanHurufPengganti(sisa);
        String hasil = ubahVokal(lirik, hurufPengganti);

        System.out.println(hasil);
    }

    private static char tentukanHurufPengganti(int sisa) {
        switch (sisa) {
            case 0:
                return 'A';
            case 1:
                return 'E';
            case 2:
                return 'I';
            case 3:
                return 'O';
            case 4:
                return 'U';
            default:
                return 'A';
        }
    }

    private static String ubahVokal(String teks, char pengganti) {
        String vokal = "AEIOUaeiou";
        StringBuilder hasil = new StringBuilder();

        for (char c : teks.toCharArray()) {
            if (vokal.indexOf(c) != -1) {
                if (Character.isUpperCase(c)) {
                    hasil.append(Character.toUpperCase(pengganti));
                } else {
                    hasil.append(Character.toLowerCase(pengganti));
                }
            } else {
                hasil.append(c);
            }
        }
        return hasil.toString();
    }
}