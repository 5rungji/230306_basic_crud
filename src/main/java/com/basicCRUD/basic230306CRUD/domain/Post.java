package com.basicCRUD.basic230306CRUD.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Post {
    private int post_id;
    private String post_title;
    private String company_name;
    private String user_name;
    private String user_pw;
    private String post_content;
    private int post_views;
    private String upload_file;
    private LocalDate post_create_date;
    private LocalDate post_update_date;
}
