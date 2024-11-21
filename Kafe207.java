public class Kafe207 {
    public static void Menu(String namaPelanggan, String kodePromo, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Berikan diskon 50%");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Berikan diskon 30%");
        } else {
            System.out.println("Kode invalid");
        }

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }

    public static void main(String[] args) {
        Menu("Andi", "diskon30",true);
    }
}
