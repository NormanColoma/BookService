package main.java.books;

/**
 * Created by norman on 14/11/16.
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class BookController {


    @RequestMapping(value = "/books", method = RequestMethod.GET, produces = "application/json")
    public ArrayList<Book> getAllBooks() {

       ArrayList<Book> books = new ArrayList<Book>();

        Book b = new Book("test");

        books.add(b);

        return books;
    }

}
