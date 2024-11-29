package com.batuhankas.exception_management.exception;

import lombok.Getter;

@Getter
public enum MessageType {

    NO_RECORD_EXIST(1001, "Kayit Bulunamadi"),
    GENERAL_EXCEPTION(9999, "General Error Occured");

    private int code;
    private String message;

    MessageType(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
