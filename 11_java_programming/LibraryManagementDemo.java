// Library Management System - Hierarchical Inheritance Example
// Best practices: encapsulation, abstract class, interface, polymorphism

/**
 * Abstract class representing a generic Library Item.
 */
abstract class LibraryItem {
    private final String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public void setTitle(String title) {
        if (title == null || title.isEmpty()) throw new IllegalArgumentException("Title cannot be empty");
        this.title = title;
    }
    public String getAuthor() { return author; }
    public void setAuthor(String author) {
        if (author == null || author.isEmpty()) throw new IllegalArgumentException("Author cannot be empty");
        this.author = author;
    }

    public abstract int getLoanDuration();

    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }
}

/**
 * Interface for reservable items.
 */
interface Reservable {
    boolean reserveItem(String borrowerName);
    boolean checkAvailability();
}

/**
 * Book implementation.
 */
class Book extends LibraryItem implements Reservable {
    private boolean available = true;
    private String borrower;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 21; // 21 days for books
    }

    @Override
    public boolean reserveItem(String borrowerName) {
        if (available) {
            available = false;
            borrower = borrowerName;
            return true;
        }
        return false;
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

/**
 * Magazine implementation.
 */
class Magazine extends LibraryItem implements Reservable {
    private boolean available = true;
    private String borrower;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 7 days for magazines
    }

    @Override
    public boolean reserveItem(String borrowerName) {
        if (available) {
            available = false;
            borrower = borrowerName;
            return true;
        }
        return false;
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

/**
 * DVD implementation.
 */
class DVD extends LibraryItem implements Reservable {
    private boolean available = true;
    private String borrower;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 14 days for DVDs
    }

    @Override
    public boolean reserveItem(String borrowerName) {
        if (available) {
            available = false;
            borrower = borrowerName;
            return true;
        }
        return false;
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

/**
 * Demo for polymorphic library item processing.
 */
public class LibraryManagementDemo {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[] {
            new Book("B001", "Java Programming", "James Gosling"),
            new Magazine("M002", "Tech Monthly", "Editorial Team"),
            new DVD("D003", "Inception", "Christopher Nolan")
        };
        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            boolean reserved = ((Reservable)item).reserveItem("Utkarsh");
            System.out.println("Reserved: " + reserved);
            System.out.println("Available: " + ((Reservable)item).checkAvailability());
            System.out.println();
        }
    }
}
