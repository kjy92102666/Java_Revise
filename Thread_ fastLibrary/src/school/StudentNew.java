package school;

import library.Book;
import library.SchoolLib;


public class StudentNew extends Thread{

    public void run(){
        Thread t = currentThread();

        try {
            Book book = SchoolLib.getInstance().lendBook();
            sleep(5000);
            SchoolLib.getInstance().returnBook(book);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Book lendBook() throws InterruptedException {
        return SchoolLib.getInstance().lendBook();
    }

    public void returnBook(Book book){
        SchoolLib.getInstance().returnBook(book);
    }
}
