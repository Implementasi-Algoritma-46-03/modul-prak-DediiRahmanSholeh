import java.util.Scanner;

public class TPO2 {

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Masukkan nama pembeli:");
        String namaPembeli = inputScanner.nextLine(); 
        System.out.println("Masukkan harga per barang:");
        int hargaPerbarang = inputScanner.nextInt();
        System.out.println("Masukkan jumlah barang:");
        int jumlahBarang = inputScanner.nextInt(); 
  
        int totalBelanja = jumlahBarang * hargaPerbarang;

        System.out.println("Hello, " + namaPembeli + ". Total belanja Anda adalah: " + totalBelanja + ".");

        inputScanner.close();
    }
    }