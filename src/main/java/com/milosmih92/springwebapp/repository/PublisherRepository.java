package com.milosmih92.springwebapp.repository;

import java.util.List;

import com.milosmih92.springwebapp.model.Author;
import org.springframework.data.repository.CrudRepository;

import com.milosmih92.springwebapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

    Publisher findById(long id);

    List<Publisher> findByName(String name);

}
