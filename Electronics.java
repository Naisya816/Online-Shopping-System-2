public class Electronics extends Product implements Discountable {
    private Specification specification;

    public Electronics(String name, double price, double weight, String brand) {
        super(name, price);
        this.specification = new Specification(weight, brand);
    }

    @Override
    public String getCategory() {
        return "Electronics";
    }

    @Override
    public double getDiscountedPrice(double discountPercentage) {
        return price - (price * discountPercentage / 100);
    }

    public Specification getSpecification() {
        return specification;
    }

    public class Specification {
        private double weight;
        private String brand;

        public Specification(double weight, String brand) {
            this.weight = weight;
            this.brand = brand;
        }

        public String getSpecs() {
            return "Brand: " + brand + ", Weight: " + weight + " kg";
        }
    }
}
