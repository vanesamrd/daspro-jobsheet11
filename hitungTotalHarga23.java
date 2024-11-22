import java.util.Scanner;
public class hitungTotalHarga23 {
    
    public static void Menu() {
        System.out.println("=====MENU RESTO KAFE=====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappucino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("=========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        return hargaItems[pilihanMenu - 1] * banyakItem;
    }

    public static int hitungDiskon(int totalHarga, String kodePromo, boolean isMember) {
        if (isMember) {
            totalHarga -= (totalHarga * 10 / 100);
        }
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            totalHarga /= 2;
            System.out.println("Selamat! Anda mendapatkan diskon 50%.");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            totalHarga -= (totalHarga * 30 / 100);
            System.out.println("Selamat! Anda mendapatkan diskon 30%.");
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Code is invalid");
        }
        return totalHarga;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = sc.nextLine();
        System.out.print("Apakah pelanggan member? (true/false): ");
        boolean isMember = sc.nextBoolean();
        sc.nextLine();

        Menu();
        int totalHarga = 0;

        System.out.println("Masukkan pesanan Anda (ketik 0 untuk selesai):");
        while (true) {
            System.out.print("Nomor menu: ");
            int pilihanMenu = sc.nextInt();
            if (pilihanMenu == 0) {
                break;
            }
            if (pilihanMenu < 1 || pilihanMenu > 6) {
                System.out.println("Nomor menu tidak valid. Silakan pilih kembali.");
                continue;
            }

            System.out.print("Jumlah item: ");
            int banyakItem = sc.nextInt();

            int hargaItem = hitungTotalHarga(pilihanMenu, banyakItem);
            totalHarga += hargaItem;

            String[] namaMenu = {"Kopi Hitam", "Cappucino", "Latte", "Teh Tarik", "Roti Bakar", "Mie Goreng"};
            System.out.println(namaMenu[pilihanMenu - 1] + " x " + banyakItem + " = Rp " + hargaItem);
        }

        sc.nextLine();
        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.nextLine();

        int totalAkhir = hitungDiskon(totalHarga, kodePromo, isMember);

        System.out.println("\nTotal harga sebelum diskon: Rp " + totalHarga);
        System.out.println("Total harga setelah diskon: Rp " + totalAkhir);
    }
}

