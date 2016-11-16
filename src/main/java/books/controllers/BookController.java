package books.controllers;

/**
 * Created by norman on 14/11/16.
 */
import books.domain.Book;
import books.service.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {


    @Autowired
    private BookRepository repository;

    @RequestMapping(value = "/books", method = RequestMethod.GET, produces = "application/json")
    public List<Book> getAllBooks() {

        List<Book> books = new ArrayList<Book>();

        for (Book b : repository.findAll()) {
            books.add(b);
        }
        return books;
    }

}
