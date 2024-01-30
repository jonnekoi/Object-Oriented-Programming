package Module2_3;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void viewBooks(){
        for(Book book : books){
            System.out.println("Title: " + book.getTitle() + " Author: " + book.getAuthor() + " Year: "
             + book.getPublicationYear());
        }
    }

    public void findBooksByAuthor(String author){
        for(Book book : books){
            if(book.getAuthor().equalsIgnoreCase(author)){
                System.out.println("Title: " + book.getTitle() + " year: " + book.getPublicationYear());
            }
        }
    }

    public void borrowBook(String title){
       for(Book book : books){
           if(book.getTitle().equalsIgnoreCase(title)){
               books.remove(book);
               System.out.print("Book: " + book.getTitle() + " borrowed.");
               return;
           }
       }
    }

    public void returnBook(Book book){
        books.add(book);
        System.out.println("Book: " + book.getTitle() + " returned.");
    }

    public boolean isBookAvailable(String title){
        for (Book book : books){
            if(book.getTitle().equalsIgnoreCase(title)){
                return true;
            }
        }
        return false;
    }


}
