package com.batuhankas.exception_management.handler;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ApiError<T> {
    private int status;

    private Exception<T> exception;
}
