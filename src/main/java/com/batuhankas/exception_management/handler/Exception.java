package com.batuhankas.exception_management.handler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Exception<T> {
    private String hostName;

    private String path;

    private Date date;

    private T message;
}
