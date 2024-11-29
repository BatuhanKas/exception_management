package com.batuhankas.exception_management.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RootEntity<T> {
    private boolean result;
    private String errorMsg;
    private T data;

    public static <T> RootEntity<T> ok(T data) {
        RootEntity<T> rootEntity = new RootEntity<>();
        rootEntity.setResult(true);
        rootEntity.setErrorMsg(null);
        rootEntity.setData(data);
        return rootEntity;
    }

    public static <T> RootEntity<T> error(String errorMsg) {
        RootEntity<T> rootEntity = new RootEntity<>();
        rootEntity.setResult(false);
        rootEntity.setErrorMsg(errorMsg);
        rootEntity.setData(null);
        return rootEntity;
    }
}
