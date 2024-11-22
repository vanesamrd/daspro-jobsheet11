import java.util.Scanner;

public class Percobaan623 {
    
    public static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    public static int hitungVolume(int pjg, int lb, int tg) {
        int Volume = pjg * lb * tg;
        return Volume;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.println("Masukkan panjang");
        p=input.nextInt();
        System.out.println("Masukkan lebar");
        l=input.nextInt();
        System.out.println("Masukkan tinggi");
        t=input.nextInt();

        L=hitungLuas(p,l);
        System.out.println("Luaas persegi panjang adalah " + L);
        vol=hitungVolume(t,p,l);
        System.out.println("Volume balok adalah " + vol);

        L=p*l;
        System.out.println("Luas persegi panjang adalah " + L);

        vol=p*l*t;
        System.out.println("Volume balok adalah " + vol);
    }
}
