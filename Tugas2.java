public class Tugas2 {

    static String[] menus = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
    static int[][] sales = {
        {20, 20, 25, 20, 10, 60, 10},
        {30, 80, 40, 10, 15, 20, 25},
        {5, 9, 20, 25, 10, 5, 45},
        {50, 8, 17, 18, 10, 30, 6},
        {15, 10, 16, 15, 10, 10, 55}
    };


    public static void displaySales() {
        System.out.println("Data Penjualan:");
        System.out.printf("%-15s", "Menu");
        for (int i = 1; i <= 7; i++) {
            System.out.printf("Hari %d ", i);
        }
        System.out.println();
        for (int i = 0; i < menus.length; i++) {
            System.out.printf("%-15s", menus[i]);
            for (int j = 0; j < 7; j++) {
                System.out.printf("%7d ", sales[i][j]);
            }
            System.out.println();
        }
    }


    public static void displayHighestSales() {
        int highestSales = 0;
        String bestSellingMenu = "";
        for (int i = 0; i < menus.length; i++) {
            int totalSales = 0;
            for (int j = 0; j < 7; j++) {
                totalSales += sales[i][j];
            }
            if (totalSales > highestSales) {
                highestSales = totalSales;
                bestSellingMenu = menus[i];
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi:");
        System.out.println(bestSellingMenu + " dengan total penjualan " + highestSales + ".");
    }


    public static void displayAverageSales() {
        System.out.println("\nRata-rata penjualan untuk setiap menu:");
        for (int i = 0; i < menus.length; i++) {
            int totalSales = 0;
            for (int j = 0; j < 7; j++) {
                totalSales += sales[i][j];
            }
            double average = totalSales / 7.0;
            System.out.printf("%-15s: %.2f%n", menus[i], average);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Rekap Data Penjualan ===");
        displaySales();
        displayHighestSales();
        displayAverageSales();
    }
}
