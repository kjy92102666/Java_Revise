package library;

import java.util.ArrayList;
import java.util.List;

public class SchoolLibrary {


    private static SchoolLibrary library = new SchoolLibrary();
    private List<Book> shelf;
    private SchoolLibrary(){
        shelf = new ArrayList<>();
        shelf.add(new Book("Demian Series 1"));
        shelf.add(new Book("Demian Series 2"));
        shelf.add(new Book("Demian Series 3"));
    }

    public static SchoolLibrary getInstance(){
        if(library == null) library = new SchoolLibrary();
        return library;
    }

    public Book lendBook() {
        Book book = shelf.remove(0);
        return book;
    }

    public void returnBook(Book book){
        shelf.add(book);
        System.out.println(book.getTitle() + " return!");
    }

    public void showShelf(){
        shelf.forEach(s->System.out.println
                ("library shelf : "+s.getTitle()));
    }
}