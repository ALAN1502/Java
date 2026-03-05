import java.util.Scanner;

class Publisher {
    String publisherName;

    void getPublisher(String name) {
        publisherName = name;
    }
}

class Book extends Publisher {
    String bookTitle;
    double price;

    void getBook(String title, double price) {
        bookTitle = title;
        this.price = price;
    }
}

class Literature extends Book {
    void display() {
        System.out.println("\nCategory : Literature");
        System.out.println("Title    : " + bookTitle);
        System.out.println("Price    : " + price);
        System.out.println("Publisher: " + publisherName);
    }
}

class Fiction extends Book {
    void display() {
        System.out.println("\nCategory : Fiction");
        System.out.println("Title    : " + bookTitle);
        System.out.println("Price    : " + price);
        System.out.println("Publisher: " + publisherName);
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Literature l = new Literature();
        Fiction f = new Fiction();

        System.out.println("Enter Literature Book Details");
        System.out.print("Title: ");
        String title = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.print("Publisher: ");
        String pub = sc.nextLine();

        l.getBook(title, price);
        l.getPublisher(pub);

        System.out.println("\nEnter Fiction Book Details");
        System.out.print("Title: ");
        String title2 = sc.nextLine();
        System.out.print("Price: ");
        double price2 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Publisher: ");
        String pub2 = sc.nextLine();

        f.getBook(title2, price2);
        f.getPublisher(pub2);

        l.display();
        f.display();

        sc.close();
    }
}