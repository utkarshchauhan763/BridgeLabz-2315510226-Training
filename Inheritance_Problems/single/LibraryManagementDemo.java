// Library Management - Single Inheritance Example
// Best practices: private fields, @Override, clear documentation

class Book {
    private String title;
    private int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public String getTitle() { return title; }
    public int getPublicationYear() { return publicationYear; }

    public void displayInfo() {
        System.out.println("Book: " + title + ", Published: " + publicationYear);
    }
}

class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name + ", Bio: " + bio);
    }
}

public class LibraryManagementDemo {
    public static void main(String[] args) {
        Author author = new Author("Java Programming", 2022, "John Doe", "Expert in Java and OOP");
        author.displayInfo();
    }
}
