package com.example.controller;


import com.example.domain.Book;
import com.example.service.BookService;
import com.example.service.SearchService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class BookController {

    @Autowired
    SearchService searchService;

    @Autowired
    BookService bookService;


    @RequestMapping(value = "/search/book", method = RequestMethod.GET)
    public String book() {
        log.info("search book");

        searchService.searchBook();
        return "";
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String success() {

        return "success";
    }
    @RequestMapping(value = "/findbook", method = RequestMethod.GET)
    public String findbook() {
        Iterable<Book> list =  bookService.findAll();
        System.out.println(list);
        return "success";
    }

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public String save() {
        Book book = new Book();
        book.setAuthor("peter");
        book.setPublish_date("2020-09-01");
        book.setWord_count(12L);
        book.setTitle("ceshi");
        bookService.save(book);
        System.out.println(book);
        return "success";
    }
}
