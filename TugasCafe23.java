import java.util.Scanner;

public class TugasCafe23 {
    static int numMenu = 5; 
    static int numDays = 7; 
    static int[][] penjualan = new int[numMenu][numDays]; 

    public static void inputPenjualan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan data penjualan untuk setiap menu:");

        for (int i = 0; i < numMenu; i++) {
            System.out.printf("Menu %d:\n", i + 1);
            for (int j = 0; j < numDays; j++) {
                System.out.printf("Hari %d: ", j + 1);
                penjualan[i][j] = scanner.nextInt(); 
            }
        }
    }


    public static void tampilkanPenjualan() {
        System.out.println("Data Penjualan:");
        for (int i = 0; i < numMenu; i++) {
            System.out.printf("Menu %d: ", i + 1);
            for (int j = 0; j < numDays; j++) {
                System.out.printf("%d ", penjualan[i][j]);
            }
            System.out.println(); 
        }
    }

    public static void tampilkanPenjualanTertinggi() {
        int totalTertinggi = 0;
        int menuTertinggi = 0;

        for (int i = 0; i < numMenu; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < numDays; j++) {
                totalPenjualan += penjualan[i][j];
            }
            if (totalPenjualan > totalTertinggi) {
                totalTertinggi = totalPenjualan;
                menuTertinggi = i + 1;
            }
        }
        System.out.printf("Menu dengan penjualan tertinggi adalah Menu %d dengan total penjualan %d.\n", menuTertinggi, totalTertinggi);
    }

    public static void tampilkanRataPenjualan() {
        System.out.println("Rata-rata Penjualan per Menu:");
        for (int i = 0; i < numMenu; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < numDays; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rataPenjualan = (double) totalPenjualan / numDays;
            System.out.printf("Menu %d: %.2f\n", i + 1, rataPenjualan);
        }
    }

    public static void main(String[] args) {
        inputPenjualan();
        tampilkanPenjualan();
        tampilkanPenjualanTertinggi();
        tampilkanRataPenjualan();
    }
}

