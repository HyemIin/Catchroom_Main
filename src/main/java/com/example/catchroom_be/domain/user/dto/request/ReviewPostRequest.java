package com.example.catchroom_be.domain.user.dto.request;

import com.example.catchroom_be.domain.review.enumlist.ReviewType;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ReviewPostRequest {

    ReviewType type;
    String content;
    Long productId;
}
