package com.larionov_dd.mongo.user.dto.response;

import com.larionov_dd.mongo.user.entity.UserDoc;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponse {
    private String id;
    private String firstName;
    private String lastName;

    public static UserResponse of(UserDoc userDoc){
        return UserResponse.builder()
                .id(userDoc.getId().toString())
                .firstName(userDoc.getFirstName().toString())
                .lastName(userDoc.getLastName().toString())
                .build();
    }
}
