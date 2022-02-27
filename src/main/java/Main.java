import admin.Repository;
import admin.model.Book;
import admin.model.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Akanksha ki hot story", "Ak", "123", 2021, 2021, 75);
        Book book2 = new Book("Akanksha ki hate story", "Ak", "124", 2021, 2021, 75);
        Repository repository = new Repository();
        repository.addBook(book1);
        repository.addBook(book2);

        User user1 = new User("Shubham", "jindalshubham34@gmail.com", "6317100162");
        User user2 = new User("Akanksha", "sharma.as@gmail.com", "123456");
        repository.addUser(user1);
        repository.addUser(user2);
        ArrayList<Book> books = repository.getBooks();
        ArrayList<User> users = repository.getUsers();

        for(Book book : books) {
            System.out.print(book.getAuthor() + " ");
            System.out.print(book.getEdition() + " ");
            System.out.print(book.getTitle() + " ");
            System.out.println("");
        }

        for(User user : users) {
            System.out.print(user.getName() + " ");
            System.out.print(user.getEmail() + " ");
            System.out.print(user.getMobile() + " ");
            System.out.print(user.getCart().getUserid() + " ");
            System.out.print(user.getUserid() + " ");
            System.out.println("");
        }


    }
}
/*

System requirements:
functional requirements

1) admin.model.User should be able to search for the book based on title, author, year, edition, ISBN, price
2) Book the book
3) Return the book
4) Extend the book
4) Fine the library User

Non functional requirements
1) 5 books
2) 1 month
3) Number of requests/second

Entities:
1) User
2) Book
3) Cart

Entity relationship
1) User [1..n] Books
2) Book [1..1] User
3) User [1..1] Cart

Methods:
Search()


ArrayList vs Vector
HashMap vs ConcurrentHashMap
HashSet vs ConcurrentHashSet
HashTable
Stack
Queue
Deque
String
Array
Character Array
String BUilder
Sorting using custom comparator
 */


