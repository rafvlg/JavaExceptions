package Seminar3.TaskFour;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Seminar3.TaskFour.exceptions.AuthorException;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Scanner scanner) throws AuthorException {
        System.out.print("Enter book title: ");
        String title = scanner.next();
        System.out.print("Enter book author: ");
        String author = scanner.next();
        if (author.matches("^.*([\\d]+).*$")) {
            throw new AuthorException("The author field should not contain numbers.");
        }
        books.add(new Book(title, author));
        System.out.println("Book added to the library.");
    }

    public void borrowBook(Scanner scanner) {
        System.out.print("Enter book title to borrow: ");
        String title = scanner.next();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isBorrowed()) {
                book.setBorrowed(true);
                System.out.println("You have borrowed the book: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not found or already borrowed.");
    }

    public void returnBook(Scanner scanner) {
        System.out.print("Enter book title to return: ");
        String title = scanner.next();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isBorrowed()) {
                book.setBorrowed(false);
                System.out.println("You have returned the book: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not found or not borrowed.");
    }
}
