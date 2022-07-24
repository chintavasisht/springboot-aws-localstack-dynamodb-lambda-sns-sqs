package com.ivanfranchin.newsconsumer.domain;

import lombok.Data;

import java.util.Date;

@Data
public class News {

    private String id;
    private String title;
    private Date publishedAt;
}