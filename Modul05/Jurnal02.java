import java.util.Scanner;

public class Jurnal02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String hariAwal = input.next().toLowerCase();
        int N = input.nextInt();

       
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

        int indexHari = -1;

      
        switch (hariAwal) {
            case "Senin": indexHari = 0; break;
            case "Selasa": indexHari = 1; break;
            case "Rabu": indexHari = 2; break;
            case "Kamis": indexHari = 3; break;
            case "Jumat": indexHari = 4; break;
            case "Sabtu": indexHari = 5; break;
            case "Minggu": indexHari = 6; break;
            default: System.out.println("Hari tidak valid!"); return;
        }

        int hasilIndex = (indexHari + N) % 7;
        System.out.println((hari[hasilIndex]));

        input.close();
     }
    }