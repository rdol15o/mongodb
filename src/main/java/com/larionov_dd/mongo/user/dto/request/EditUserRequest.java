package com.larionov_dd.mongo.user.dto.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EditUserRequest extends CreateUserRequest{
    private String id;
}
