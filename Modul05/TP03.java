import java.util.*;

public class TP03{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String bangun = input.nextLine().toLowerCase();

        switch (bangun) {
            case "persegi":
                double sisi = input.nextDouble();
                double luasP = sisi * sisi;
                double kelilingP = 4 * sisi;
                System.out.println((int)luasP + " " + (int)kelilingP);
                break;

            case "persegi panjang":
                double panjang = input.nextDouble();
                double lebar = input.nextDouble();
                double luasPP = panjang * lebar;
                double kelilingPP = 2 * (panjang + lebar);
                System.out.println((int)luasPP + " " + (int)kelilingPP);
                break;

            case "segitiga":
                double alas = input.nextDouble();
                double tinggi = input.nextDouble();
                double luasS = (alas * tinggi) / 2;
                double miring = Math.sqrt(alas * alas + tinggi * tinggi);
                double kelilingS = alas + tinggi + miring;
                // keliling segitiga tidak bulat, tampilkan 2 angka desimal
                System.out.printf("%.0f %.0f\n", luasS, kelilingS);
                break;

            case "lingkaran":
                double diameter = input.nextDouble();
                double jari2 = diameter / 2;
                double luasL = 3.14 * jari2 * jari2;
                double kelilingL = 3.14 * diameter;
                System.out.printf("%.2f %.2f\n", luasL, kelilingL);
                break;

            default:
                
                break;
        }

        input.close();
    }
}