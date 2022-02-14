package br.com.sigaBemApi.Util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class CargaNotFound {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ValidacaoErro> MethodArgumentNotValidException(MethodArgumentNotValidException e, HttpServletRequest request) {
        ValidacaoErro err = new ValidacaoErro(HttpStatus.BAD_REQUEST.value(), "Erro de Validação", System.currentTimeMillis());
        for (FieldError x : e.getBindingResult().getFieldErrors()){
            err.AddError(x.getField(), x.getDefaultMessage());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }


    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<ValidacaoErro> HttpMessageNotReadableException(HttpMessageNotReadableException e, HttpServletRequest request) {
        ValidacaoErro err = new ValidacaoErro(HttpStatus.BAD_REQUEST.value(), "Erro de Requisição", System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
    }

    @ExceptionHandler(PostalNotFound.class)
    public ResponseEntity<ValidacaoErro> HttpMessageNotReadableException(PostalNotFound e, HttpServletRequest request) {
        ValidacaoErro err = new ValidacaoErro(HttpStatus.BAD_REQUEST.value(), e.getMessage(), System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
    }
}
