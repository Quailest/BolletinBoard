package com.example.BolletinBoard.controller.form;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
public class ArticleForm {
    @Id
    @Column
    private long id;

    @Column
    private String text;

    @Column
    private String title;

}
