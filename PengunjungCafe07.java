public class PengunjungCafe07 {
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar nama pengunjung:");

        for (String string : namaPengunjung) {
            System.out.println("- " + string);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
    }
}
