package school;

import library.Book;
import library.SchoolLibrary;

public class Student {
    public Book lendBook(){
        return SchoolLibrary.getInstance().lendBook();
    }

    public void returnBook(Book book){
        SchoolLibrary.getInstance().returnBook(book);
    }
}
