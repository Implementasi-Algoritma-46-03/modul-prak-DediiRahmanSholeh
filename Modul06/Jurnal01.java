import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        String Nama1 = input.nextLine();
        String Nama2 = input.nextLine();
        int jam = input.nextInt();

        String sapaan = kataSapaan(jam);

        tampilkanSapaan(Nama1, sapaan);
        tampilkanSapaan(Nama2, sapaan);
    }

    private static String kataSapaan(int jam) {
        if (jam >= 6 && jam <= 11) {
            return "pagi";
        } else if (jam >= 12 && jam <= 14) {
            return "siang";
        } else if (jam >= 15 && jam <= 17) {
            return "sore";
        } else if (jam >= 18 && jam <= 5){
            return "malam";
        }
        else {
          return "";
        }
     
    }

    private static void tampilkanSapaan(String nama, String sapaan) {
        System.out.println("Halo, " + nama + ". Selamat " + sapaan + ".");
    }

}
