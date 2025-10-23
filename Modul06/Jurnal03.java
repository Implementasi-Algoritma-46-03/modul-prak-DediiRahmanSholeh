import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double h = sc.nextDouble();
        double t = sc.nextDouble();

        hitungDanTampilkan(r, h, t);
    }

    private static void hitungDanTampilkan(double r, double h, double t) {
        double volumeMaks = hitungVolume(r, h);
        double volumeSekarang = hitungVolume(r, t);
        double persen = hitungPersen(t, h);

        tampilkanHasil(volumeMaks, volumeSekarang, persen);
    }

    private static double hitungVolume(double r, double tinggi) {
        double pi = 3.14;
        return pi * r * r * tinggi;
    }

    private static double hitungPersen(double t, double h) {
        double persen = (t / h) * 100;
        return persen;
    }

    private static void tampilkanHasil(double volMaks, double volSekarang, double persen) {

        String kategori;
        switch ((int) persen / 25) {
            case 0:
                kategori = "";
                break;
            case 1:
                kategori = "";
                break;
            case 2:
                kategori = "";
                break;
            case 3:
                kategori = "";
                break;
            default:
                kategori = "";
        }

        System.out.printf("%.2f %.2f %.1f%", volMaks, volSekarang, persen, kategori);
    }
}