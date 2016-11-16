package books.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by norman on 14/11/16.
 */
@Entity
public class Book {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String name;


    public Book(){
        this.name = "";
    };
    public Book(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public long getId(){ return id; }
}
