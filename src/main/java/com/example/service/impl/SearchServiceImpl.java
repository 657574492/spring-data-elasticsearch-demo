package com.example.service.impl;

import com.example.domain.Book;
import com.example.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.elasticsearch.index.query.QueryBuilders.matchAllQuery;

//import org.elasticsearch.index.query.QueryBuilders;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Override
    public void searchBook() {
        String keywords = "李四";
        SearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withQuery(matchAllQuery()).build();
       List<Book> bookList = elasticsearchTemplate.queryForList(searchQuery, Book.class);
        System.out.println("----" + bookList);

    }
}
