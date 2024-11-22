import java.util.Scanner;

public class Kubus23 {
    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    public static double hitungLuasPermukaan(double sisi) {
        return 6 * (sisi * sisi);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = input.nextDouble();

        double volume = hitungVolume(sisi);
        double luasPermukaan = hitungLuasPermukaan(sisi);

        System.out.println("Volume kubus adalah: " + volume);
        System.out.println("Luas permukaan kubus adalah: " + luasPermukaan);
    }
}

