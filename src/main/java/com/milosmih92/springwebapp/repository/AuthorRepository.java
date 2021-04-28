package com.milosmih92.springwebapp.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.milosmih92.springwebapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

    Author findById(long id);

    List<Author> findByFirstNameAndLastName(String firstName, String lastName);

}
