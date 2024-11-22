public class PengunjungCafe23 {
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
    }
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        //for (int i = 0; i < namaPengunjung.length; i++) {
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama
        );
        }
            //System.out.println("- " + namaPengunjung[i]);
        //}
    }
}
