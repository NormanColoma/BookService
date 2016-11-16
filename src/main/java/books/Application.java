package books;

import books.domain.Book;
import books.service.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(BookRepository repository) {
        return (args) -> {
            // save a couple of books
            repository.save(new Book("Harry Potter"));
            repository.save(new Book("The Lord of the Rings"));
            repository.save(new Book("A Song of Ice and Fire"));
        };
    }
}