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
    //CONTOH SOAL NO.3
    //public void cetakAngka(String pesan, int... angka) {
        //System.out.Println(pesan);
        //for (int num : angka) {
            //System.out.println(num);
        //}
    //}
    //printAngka("Daftar Angka:" , 1, 2, 3, 4, 5);
}
