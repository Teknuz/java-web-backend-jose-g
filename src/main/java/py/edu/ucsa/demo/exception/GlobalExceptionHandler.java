package py.edu.ucsa.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    /*@ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)//Metodo convencional de manejo de errores
    public Map<String, String> handleValidationErrors(MethodArgumentNotValidException ex) {
     Map<String, String> errors = new HashMap<>();

     ex.getBindingResult().getFieldErrors().forEach(error ->{
         errors.put(error.getField(), error.getDefaultMessage());
     });

    return errors;
    }

     */
    //Metodo para manejar varios errores guardando dentro del map, un list
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, List<String>> handleValidationErrors2(MethodArgumentNotValidException ex){
        Map<String, List<String>> errors = new HashMap<>();

        ex.getBindingResult().getFieldErrors().forEach(error ->{
            errors.computeIfAbsent(error.getField(),key -> new ArrayList<>())
                    .add(error.getDefaultMessage());
        });
        return errors;
    }



}

