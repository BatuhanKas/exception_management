package com.batuhankas.exception_management.handler;

import com.batuhankas.exception_management.exception.BaseException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

// Exception Class'i oldugunu belirtiyorsun
@ControllerAdvice
public class GlobalExceptionHandler {

    // Hangi exception'i handle ediyorsun bu endpoint'e o class'in ismini veriyorsun
    @ExceptionHandler(value = {BaseException.class})
    public <T> ResponseEntity<ApiError> handleBaseException(BaseException baseException, HttpServletRequest httpServletRequest) {
        ApiError<T> apiError = (ApiError<T>) prepareApiError(baseException.getMessage(), httpServletRequest);
        return ResponseEntity.badRequest().body(apiError);
    }

    private <T> ApiError<T> prepareApiError(T message, HttpServletRequest httpServletRequest) {
        ApiError<T> apiError = new ApiError<T>();
        apiError.setStatus(HttpStatus.NOT_FOUND.value());

        Exception<T> exception = new Exception<>();
        exception.setDate(new Date());
        exception.setPath(httpServletRequest.getRequestURL().toString());
        exception.setHostName(httpServletRequest.getLocalName());
        exception.setMessage(message);

        apiError.setException(exception);

        return apiError;
    }
}
