package library;

import java.util.ArrayList;
import java.util.List;

public class SchoolLib {

    private static SchoolLib library = new SchoolLib();
    private List<Book> shelf;
    private SchoolLib(){
        shelf = new ArrayList<>();
        shelf.add(new Book("Demian Series 1"));
        shelf.add(new Book("Demian Series 2"));
        shelf.add(new Book("Demian Series 3"));
    }

    public static SchoolLib getInstance(){
        if(library == null) library = new SchoolLib();
        return library;
    }

    public synchronized Book lendBook() throws InterruptedException {
        Thread t = Thread.currentThread();
        while (shelf.size() == 0){
            System.out.println(t.getName() + "waiting start~");
            wait();
            System.out.println(t.getName() + "waiting end");
            //Thread.sleep(200);
            //continue;
        }

        Book book = shelf.remove(0);
        System.out.println(book.getTitle() + " lend book!");
        return book;
    }

    public synchronized void returnBook(Book book){
        Thread t = Thread.currentThread();
        shelf.add(book);
        notifyAll();
        System.out.println(t.getName() + ": "+book.getTitle() + " return!");
    }

    public void showShelf(){
        shelf.forEach(s->System.out.println
                ("library shelf : "+s.getTitle()));
    }
}
