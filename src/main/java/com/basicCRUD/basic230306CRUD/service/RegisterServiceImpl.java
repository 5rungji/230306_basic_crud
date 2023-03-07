package com.basicCRUD.basic230306CRUD.service;

import com.basicCRUD.basic230306CRUD.domain.Post;
import com.basicCRUD.basic230306CRUD.dto.PostReqDto;
import com.basicCRUD.basic230306CRUD.repository.RegisterRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class RegisterServiceImpl implements RegisterService{
    private final RegisterRepository registerData;
    @Override
    public boolean registe(PostReqDto postReqDto) throws Exception {

        Post postEntity = postReqDto.toPostEntity();
        log.info("[RegisterServiceImpl] 게시글 등록: {}", postEntity);
        int result1 = registerData.postInsert(postEntity);

        if(result1 == 0){ // 위에가 문제될 경우 resultCount가 0이되어 강제발생된다.
            log.info("[RegisterServiceImpl] 게시글 등록 오류");
        }
        return false;
    }
}
