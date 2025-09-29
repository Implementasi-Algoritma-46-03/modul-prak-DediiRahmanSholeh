import java.util.Scanner;

public class TPO2 {

    public static void main(String[] args) {

        // 1. Inisialisasi Scanner untuk menerima input
        Scanner inputScanner = new Scanner(System.in);

        // 2. Menerima input dari pengguna
        System.out.println("Masukkan nama pembeli:");
        String namaPembeli = inputScanner.nextLine(); 
        System.out.println("Masukkan harga per barang:");
        int hargaPerbarang = inputScanner.nextInt(); 
        System.out.println("Masukkan jumlah barang:");
        int jumlahBarang = inputScanner.nextInt(); 
        
        // 3. Menghitung total belanja
        int totalBelanja = jumlahBarang * hargaPerbarang;

        // 4. Menampilkan output
        System.out.println("Hello, " + namaPembeli + ". Total belanja Anda adalah: " + totalBelanja + ".");

        // 5. Menutup objek Scanner
        inputScanner.close();
    }
}