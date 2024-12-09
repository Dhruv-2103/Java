import java.util.Scanner;

class Publisher {
    public String publisherName;
    public int publisherId;

    public void getdata(Scanner scanner) {
        System.out.print("Enter Publisher Name: ");
        publisherName = scanner.nextLine();
        System.out.print("Enter Publisher ID: ");
        publisherId = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer
    }

    public void showdata() {
        System.out.println("Publisher Name: " + publisherName);
        System.out.println("Publisher ID: " + publisherId);
    }
}

class Book extends Publisher {
    public String bookName;
    public int bookId;
    public String authorName;

    public void getdata(Scanner scanner) {
        super.getdata(scanner); // Get publisher details
        System.out.print("Enter Book Name: ");
        bookName = scanner.nextLine();
        System.out.print("Enter Book ID: ");
        bookId = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer
        System.out.print("Enter Author Name: ");
        authorName = scanner.nextLine();
    }

    public void showdata() {
        super.showdata(); // Display publisher details
        System.out.println("Book Name: " + bookName);
        System.out.println("Book ID: " + bookId);
        System.out.println("Author Name: " + authorName);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book book = new Book();
        book.getdata(scanner); // Collect data from user
        System.out.println("\n--- Book and Publisher Details ---");
        book.showdata(); // Display the collected data

        scanner.close();
    }
}