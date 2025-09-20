package org.example.multitenetcourse;


import jakarta.servlet.http.HttpServletRequest;
import org.example.multitenetcourse.domain.exception.SubjectNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({
            SubjectNotFound.class
    })
    public ResponseEntity<ErrorDetails> handleNotFoundException(RuntimeException ex ,
                                                                HttpServletRequest servletRequest){
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(buildErrorDetails(servletRequest, HttpStatus.NOT_FOUND, ex.getMessage()));    }

    private ErrorDetails buildErrorDetails(HttpServletRequest request,
                                           HttpStatus status,
                                           String message) {
        return buildErrorDetails(request, status, message, message);
    }

    // unified error response - النسخة مع التفاصيل
    private ErrorDetails buildErrorDetails(HttpServletRequest request,
                                           HttpStatus status,
                                           String message,
                                           String details) {
        ErrorDetails errorResponse = new ErrorDetails();
        errorResponse.setTimestamp(LocalDateTime.now());
        errorResponse.setStatus(status.value());
        errorResponse.setError(status.getReasonPhrase());
        errorResponse.setMessage(message);
        errorResponse.setPath(request.getRequestURI());
        return errorResponse;
    }
}
