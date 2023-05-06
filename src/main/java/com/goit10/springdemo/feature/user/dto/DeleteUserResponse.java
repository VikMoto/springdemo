package com.goit10.springdemo.feature.user.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DeleteUserResponse {
    private boolean success;
    private Error error;

    public enum Error {
        ok,
        userNotFound
    }

    public static DeleteUserResponse success() {
        return DeleteUserResponse.builder().success(true).error(Error.ok).build();
    }


    public static DeleteUserResponse failed(Error error) {
        return DeleteUserResponse.builder().success(false).error(error).build();
    }
}
