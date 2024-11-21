import java.util.Scanner;

public class hitungTotalHarga07 {
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Berikan diskon 50%");
            hargaTotal -= hargaTotal / 2;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Berikan diskon 30%");
            hargaTotal -= hargaTotal * 30 / 100;
        } else {
            System.out.println("Kode invalid");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
        
        Scanner sc = new Scanner(System.in);

        System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
        int pilihanMenu = sc.nextInt();

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        sc.nextLine();

        System.out.println("Masukkan kode promo: ");
        String kodePromo = sc.nextLine();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total harga untuk pesanan anda: Rp" + totalHarga);
    }
}
