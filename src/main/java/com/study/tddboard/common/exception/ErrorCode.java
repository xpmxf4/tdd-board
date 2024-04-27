package com.study.tddboard.common.exception;

import lombok.*;
import org.springframework.http.*;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    /* 400 BAD_REQUEST */
    ACCESS_DENIED_ERROR(HttpStatus.UNAUTHORIZED, "접근이 허용되지 않습니다."),
    FILED_VALIDATION_FAILED(HttpStatus.BAD_REQUEST, "필드값이 유효하지 않습니다."),

    /* 404 NOT FOUND : Resource 를 찾을 수 없음 */
    MEMBER_NOT_FOUND_BY_ID(HttpStatus.NOT_FOUND, "해당 멤버 ID가 없습니다: %s"),
    MEMBER_NOT_FOUND_BY_NAME(HttpStatus.NOT_FOUND, "해당 멤버 이름이 없습니다: %s"),
    POST_NOT_FOUND_BY_ID(HttpStatus.NOT_FOUND, "해당 게시물 ID가 없습니다: %s"),
    COMMENT_NOT_FOUND_BY_ID(HttpStatus.NOT_FOUND, "해당 댓글 ID가 없습니다: %s"), ;

    /* 409 CONFLICT */
    // 여기에 INVALID_MEMBER_ID_IS_INCLUDED 넣을까 고민했는 데
    // IETF 명세에 따라 상태 수정이 아닌 삭제라서 안 넣음
    // https://datatracker.ietf.org/doc/html/rfc7231#section-6.5.8

    private final HttpStatus httpStatus;
    private final String detail; // %s 가 포함된 detail
}