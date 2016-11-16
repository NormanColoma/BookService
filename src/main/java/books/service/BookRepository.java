package books.service;

/**
 * Created by norman on 16/11/16.
 */
import java.util.List;

import books.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findByName(String name);
}
