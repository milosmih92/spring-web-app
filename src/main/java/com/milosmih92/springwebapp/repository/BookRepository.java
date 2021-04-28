package com.milosmih92.springwebapp.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.milosmih92.springwebapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

    Book findById (long id);

    List<Book> findByTitle(String title);

    Book findByIsbn(String isbn);

}
