import java.util.Scanner;

public class Jurnal01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        int kode = input.nextInt();  // kode menu (1-4)
        int jumlah = input.nextInt(); // jumlah pesanan

        String menu = "";
        int harga = 0;

       
        switch (kode) {
            case 1:
                menu = "Nasi Goreng";
                harga = 15;
                break;
            case 2:
                menu = "Mie Goreng / Nyemek";
                harga = 18;
                break;
            case 3:
                menu = "Kwetiau Goreng / Nyemek";
                harga = 20;
                break;
            case 4:
                menu = "Capcay Goreng / Kuah";
                harga = 23;
                break;
            default:
                System.out.println("");
             
        }

        int total = harga * jumlah;

        // Output hasil
        System.out.println(menu + " " + jumlah + " buah, total harga Rp. " + total + ".000");

        input.close();
    }
}