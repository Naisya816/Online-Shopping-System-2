import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public abstract class Product {
    protected String name;
    protected double price;
    protected LocalDate createdDate;
    protected LocalTime createdTime;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        LocalDateTime now = LocalDateTime.now();
        this.createdDate = now.toLocalDate();
        this.createdTime = now.toLocalTime();
    }

    public abstract String getCategory();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public LocalTime getCreatedTime() {
        return createdTime;
    }
}
