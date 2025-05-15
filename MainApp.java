import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        boolean lanjut = true;

        System.out.println("Selamat datang di Online Shop!");

        while (lanjut) {
            System.out.println("\nDaftar produk yang tersedia:");
            System.out.println("1. Laptop ASUS - Rp15000000");
            System.out.println("2. HP Samsung - Rp5000000");
            System.out.println("3. TV LG - Rp3500000");
            System.out.println("4. Kipas Angin Maspion - Rp250000");
            System.out.println("5. Baju Polos - Rp120000");
            System.out.println("6. Knit Sweater - Rp180000");
            System.out.println("7. Gamis - Rp250000");
            System.out.println("8. Celana Jeans - Rp200000");
            System.out.println("9. Rok Span - Rp150000");
            System.out.print("Masukkan nomor produk yang ingin dibeli: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Masukkan jumlah yang ingin dibeli: ");
            int jumlah = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    cart.addItem(new Electronics("Laptop ASUS", 15000000, 1.5, "ASUS"), jumlah);
                    break;
                case 2:
                    cart.addItem(new Electronics("HP Samsung", 5000000, 0.2, "Samsung"), jumlah);
                    break;
                case 3:
                    cart.addItem(new Electronics("TV LG", 3500000, 7.0, "LG"), jumlah);
                    break;
                case 4:
                    cart.addItem(new Electronics("Kipas Angin Maspion", 250000, 2.0, "Maspion"), jumlah);
                    break;
                case 5:
                    cart.addItem(buatClothing(scanner, "Baju Polos", 120000), jumlah);
                    break;
                case 6:
                    cart.addItem(buatClothing(scanner, "Knit Sweater", 180000), jumlah);
                    break;
                case 7:
                    cart.addItem(buatClothing(scanner, "Gamis", 250000), jumlah);
                    break;
                case 8:
                    cart.addItem(buatClothing(scanner, "Celana Jeans", 200000), jumlah);
                    break;
                case 9:
                    cart.addItem(buatClothing(scanner, "Rok Span", 150000), jumlah);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.print("Ingin belanja lagi? (y/n): ");
            String jawaban = scanner.nextLine();
            lanjut = jawaban.equalsIgnoreCase("y");
        }

        cart.printCart(10);
        scanner.close();
    }

    private static Clothing buatClothing(Scanner scanner, String name, double price) {
        System.out.print("Pilih ukuran (XS, S, M, L, XL): ");
        String ukuran = scanner.nextLine().toUpperCase();
        Size size = Size.valueOf(ukuran);
        return new Clothing(name, price, size);
    }
}
