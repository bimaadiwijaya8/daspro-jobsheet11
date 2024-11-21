import java.util.Scanner;

public class Kubus07 {
    public static int volumeKubus (int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }

    public static int luasPermukaan (int a) {
        int luas = (a * a) * 6;
        return luas;
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Masukkan berapa sisi kubus");
        int sisi = input.nextInt();
        
        int volume = volumeKubus(sisi);
        System.out.println("Volume pada kubus adalah " + volume);

        int luas = luasPermukaan(sisi);
        System.out.println("Luas Permukaan kubus adalah " + luas);
    }
}
