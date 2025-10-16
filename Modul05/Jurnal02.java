import java.util.Scanner;

public class Jurnal02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String hariAwal = input.next().toLowerCase();
        int N = input.nextInt();

       
        String[] hari = {"senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu"};

        int indexHari = -1;

      
        switch (hariAwal) {
            case "senin": indexHari = 0; break;
            case "selasa": indexHari = 1; break;
            case "rabu": indexHari = 2; break;
            case "kamis": indexHari = 3; break;
            case "jumat": indexHari = 4; break;
            case "sabtu": indexHari = 5; break;
            case "minggu": indexHari = 6; break;
            default: System.out.println("Hari tidak valid!"); return;
        }

        int hasilIndex = (indexHari + N) % 7;
        System.out.println((hari[hasilIndex]));

        input.close();
     }
    }