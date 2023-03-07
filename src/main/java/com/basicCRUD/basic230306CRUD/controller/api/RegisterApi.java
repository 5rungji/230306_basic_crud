package com.basicCRUD.basic230306CRUD.controller.api;

import com.basicCRUD.basic230306CRUD.dto.CMRespDto;
import com.basicCRUD.basic230306CRUD.dto.PostReqDto;
import com.basicCRUD.basic230306CRUD.service.RegisterService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/api")
@RestController
@RequiredArgsConstructor
public class RegisterApi {
    private final RegisterService registerService;

    // 게시글 등록
    @PostMapping("/register") //Json은 늘 @RequestBody가 따라와야한다
    public ResponseEntity<?> donate(@RequestBody PostReqDto postReqDto) throws Exception {
        log.info("[RegisterApi] 게시글 등록 데이터: {}", postReqDto);

        registerService.registe(postReqDto);

        return ResponseEntity.ok(new CMRespDto<>(1, "게시글 등록 성공", postReqDto));
    }

}
