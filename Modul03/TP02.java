import java.util.Scanner;

public class TP02 {

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

       
        String namaPembeli = inputScanner.next(); 

        int jumlahBarang = inputScanner.nextInt(); 
      
        int hargaPerbarang = inputScanner.nextInt();
  
        int totalBelanja = jumlahBarang * hargaPerbarang;

        System.out.println("Hi, " + namaPembeli+ ". Total belanja adalah " + totalBelanja + " rupiah");

       
      }
    }