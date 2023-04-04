import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("choose an option");
            System.out.println("1. Add a Book");
            System.out.println("2. Display all books");
            System.out.println("3. Search for a book");
            System.out.println("4. Remove a book");
            System.out.println("5. exit");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    addBook(sc, books);
                    break;
                case 2:
                    displayBooks(books);
                    break;
                case 3:
                    searchBook(sc, books);
                    break;
                case 4:
                    removeBook(sc, books);
                    break;
                case 5:
                    System.out.println("Exiting .....");
                    return;
                default:
                    System.out.println("invalid option. try Again");
            }
        } 
    }
    private static void addBook(Scanner sc, ArrayList<Book> books) {
        System.out.println("Enter the book title");
        String title = sc.next();
        System.out.println("Enter the author name");
        String author = sc.next();
        System.out.println("Enter the Publication Year");
        int Year = sc.nextInt();
        Book book = new Book(title, author, Year);
        books.add(book);
        System.out.println("Book added");
    }
    private  static void displayBooks(ArrayList<Book> books){
        System.out.println("List of books");
        for(Book book: books){
            System.out.println(book);
        }
        
    }
    private static void searchBook(Scanner sc, ArrayList<Book> books) {
        System.out.println("enter the book title to search here");
        String title = sc.next();
        for(Book book : books){
            System.out.println(book);
            return;
        }
        System.out.println("book not found");
    }
    
    private static void removeBook(Scanner sc, ArrayList<Book> books) {
        System.out.println("Enter the book title to remove");
        String title = sc.next();
        for(Book book: books){
            if(book.getTitle().equals(title)){
                books.remove(book);
                System.out.println("Book Removed");
                return;
            }
        }
        System.out.println("book not found");
    }
}

class Book {
    private String title;
    private int year;
    private String author;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int year() {
        return year;
    }

    public String author() {
        return author;
    }

    @Override
    public String toString() {
        return title + " by " + author + " , published in " + year;
    }
}