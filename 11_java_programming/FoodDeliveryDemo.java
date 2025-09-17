// Online Food Delivery System - Hierarchical Inheritance Example
// Best practices: encapsulation, abstract class, interface, polymorphism

/**
 * Abstract class representing a generic Food Item.
 */
abstract class FoodItem {
    private final String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public void setPrice(double price) {
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative");
        this.price = price;
    }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) {
        if (quantity < 0) throw new IllegalArgumentException("Quantity cannot be negative");
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }
}

/**
 * Interface for discountable items.
 */
interface Discountable {
    void applyDiscount(double percent);
    String getDiscountDetails();
}

/**
 * Veg item implementation.
 */
class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) - discount;
    }

    @Override
    public void applyDiscount(double percent) {
        discount = getPrice() * getQuantity() * percent / 100;
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Discount: " + discount;
    }
}

/**
 * Non-veg item implementation.
 */
class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    private static final double NON_VEG_CHARGE = 50; // extra charge per item

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity() + NON_VEG_CHARGE * getQuantity()) - discount;
    }

    @Override
    public void applyDiscount(double percent) {
        discount = (getPrice() * getQuantity() + NON_VEG_CHARGE * getQuantity()) * percent / 100;
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Discount: " + discount;
    }
}

/**
 * Demo for polymorphic food item processing.
 */
public class FoodDeliveryDemo {
    public static void main(String[] args) {
        FoodItem[] order = new FoodItem[] {
            new VegItem("Paneer Tikka", 250, 2),
            new NonVegItem("Chicken Biryani", 300, 3)
        };
        for (FoodItem item : order) {
            ((Discountable)item).applyDiscount(10); // 10% discount
            System.out.println(item.getItemDetails());
            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println(((Discountable)item).getDiscountDetails());
            System.out.println();
        }
    }
}
