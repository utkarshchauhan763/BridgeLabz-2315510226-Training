// E-Commerce Platform - Hierarchical Inheritance Example
// Best practices: encapsulation, abstract class, interface, polymorphism

/**
 * Abstract class representing a generic Product.
 */
abstract class Product {
    private final String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId() { return productId; }
    public String getName() { return name; }
    public void setName(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
    }
    public double getPrice() { return price; }
    public void setPrice(double price) {
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative");
        this.price = price;
    }

    public abstract double calculateDiscount();
}

/**
 * Interface for taxable products.
 */
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

/**
 * Electronics product implementation.
 */
class Electronics extends Product implements Taxable {
    private double warrantyYears;

    public Electronics(String productId, String name, double price, double warrantyYears) {
        super(productId, name, price);
        this.warrantyYears = warrantyYears;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }

    @Override
    public String getTaxDetails() {
        return "Electronics GST: 18%";
    }
}

/**
 * Clothing product implementation.
 */
class Clothing extends Product implements Taxable {
    private String size;

    public Clothing(String productId, String name, double price, String size) {
        super(productId, name, price);
        this.size = size;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15; // 15% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% GST
    }

    @Override
    public String getTaxDetails() {
        return "Clothing GST: 5%";
    }
}

/**
 * Groceries product implementation.
 */
class Groceries extends Product {
    private String expiryDate;

    public Groceries(String productId, String name, double price, String expiryDate) {
        super(productId, name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}

/**
 * Demo for polymorphic product processing.
 */
public class ECommercePlatformDemo {
    public static void main(String[] args) {
        Product[] products = new Product[] {
            new Electronics("P001", "Laptop", 60000, 2),
            new Clothing("P002", "T-Shirt", 800, "L"),
            new Groceries("P003", "Rice", 1200, "2025-12-31")
        };
        for (Product prod : products) {
            double tax = (prod instanceof Taxable) ? ((Taxable)prod).calculateTax() : 0;
            double discount = prod.calculateDiscount();
            double finalPrice = prod.getPrice() + tax - discount;
            System.out.println("Product: " + prod.getName() + ", Final Price: " + finalPrice);
            if (prod instanceof Taxable) {
                System.out.println(((Taxable)prod).getTaxDetails());
            }
            System.out.println();
        }
    }
}
