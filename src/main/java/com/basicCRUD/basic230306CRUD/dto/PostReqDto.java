package com.basicCRUD.basic230306CRUD.dto;

import com.basicCRUD.basic230306CRUD.domain.Post;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostReqDto {
    private int postId;
    private String postTitle;
    private String companyName;
    private String userName;
    private String userPw;
    private String postContent;
    private int postViews;
    private String uploadFile;
    private LocalDate postCreateDate;
    private LocalDate postUpdateDate;

    public Post toPostEntity(){
        return Post.builder()
                .post_id(postId)
                .post_title(postTitle)
                .company_name(companyName)
                .user_name(userName)
                .user_pw(userPw)
                .post_content(postContent)
                .post_views(postViews)
                .upload_file(uploadFile)
                .post_create_date(postCreateDate)
                .post_update_date(postUpdateDate)
                .build();
    }
}