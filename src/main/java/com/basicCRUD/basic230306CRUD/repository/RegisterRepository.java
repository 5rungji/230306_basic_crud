package com.basicCRUD.basic230306CRUD.repository;

import com.basicCRUD.basic230306CRUD.domain.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RegisterRepository {
    // 게시글 등록
    public int postInsert(Post post);
}
