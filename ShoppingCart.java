import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;

public class ShoppingCart {
    private static class CartItem {
        Product product;
        int quantity;

        CartItem(Product product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }
    }

    private List<CartItem> items = new ArrayList<>();
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public void addItem(Product item, int quantity) {
        items.add(new CartItem(item, quantity));
    }

    public void printCart(double discountPerItem) {
        System.out.println("\n== Isi Keranjang ==");
        double total = 0;
        for (CartItem cartItem : items) {
            Product item = cartItem.product;
            int qty = cartItem.quantity;
            System.out.println("Nama: " + item.getName());
            System.out.println("Kategori: " + item.getCategory());
            if (item instanceof Clothing) {
                System.out.println("Ukuran: " + ((Clothing) item).getSize());
            }
            if (item instanceof Electronics) {
                System.out.println("Spesifikasi: " + ((Electronics) item).getSpecification().getSpecs());
            }
            System.out.println("Jumlah: " + qty);
            System.out.println("Tanggal Dibuat: " + item.getCreatedDate());
            System.out.println("Waktu Dibuat: " + item.getCreatedTime().withNano(0));
            double totalItemPrice;
            if (item instanceof Discountable) {
                double discountedPrice = ((Discountable) item).getDiscountedPrice(discountPerItem);
                totalItemPrice = discountedPrice * qty;
                System.out.println("Harga setelah diskon per item: Rp" + df.format(discountedPrice));
            } else {
                totalItemPrice = item.getPrice() * qty;
                System.out.println("Harga: Rp" + df.format(item.getPrice()));
            }
            total += totalItemPrice;
            System.out.println("Subtotal: Rp" + df.format(totalItemPrice));
            System.out.println("------------------------");
        }
        System.out.println("Total Harga Semua Barang: Rp" + df.format(total));
    }
}
