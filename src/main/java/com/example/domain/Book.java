package com.example.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

@Document(indexName = "book", type = "novel",useServerConfiguration = true,createIndex = false)
public class Book implements Serializable {

    @Id
    private String id;

    @Field(type = FieldType.text)
    private String author;
    @Field(type = FieldType.text)
    private String title;

    @Field(type = FieldType.Long)
    private Long word_count;

    @Field(type = FieldType.text)
    private String publish_date;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getWord_count() {
        return word_count;
    }

    public void setWord_count(Long word_count) {
        this.word_count = word_count;
    }

    public String getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(String publish_date) {
        this.publish_date = publish_date;
    }
}
