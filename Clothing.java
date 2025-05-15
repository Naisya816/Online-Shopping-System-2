public class Clothing extends Product implements Discountable {
    private Size size;

    public Clothing(String name, double price, Size size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public String getCategory() {
        return "Clothing";
    }

    public Size getSize() {
        return size;
    }

    @Override
    public double getDiscountedPrice(double discountPercentage) {
        return price - (price * discountPercentage / 100);
    }
}