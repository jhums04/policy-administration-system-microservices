package com.policyadminsystem.policyadminsystem.exception;

import com.policyadminsystem.policyadminsystem.dto.ErrorResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(AccountOwnerNotFoundException.class)
    public ResponseEntity<ErrorResponseDTO> accountOwnerNotFoundException(AccountOwnerNotFoundException exception, WebRequest webRequest) {
        ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO(
                webRequest.getDescription(false),
                HttpStatus.NOT_FOUND,
                exception.getMessage(),
                LocalDateTime.now()
        );
        return new  ResponseEntity<>(errorResponseDTO, HttpStatus.NOT_FOUND);
    }
}
