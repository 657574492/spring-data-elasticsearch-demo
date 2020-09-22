package com.example.repository;


import com.example.domain.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.Optional;

public interface BookRepository extends ElasticsearchRepository<Book, String> {

    Optional<Book> findById(String id);



}