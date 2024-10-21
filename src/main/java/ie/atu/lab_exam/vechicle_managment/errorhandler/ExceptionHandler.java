package ie.atu.lab_exam.vechicle_managment.errorhandler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice

public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler
    @ResponseStatus
    public ResponseEntity<Map><String>>handleValidationExceptions(
            MethodArgumentNotValidException ex){
        Map<string, string> errors = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error->){
            errors.put(error.getFieldErrors(), errorgetDefualtMessage());
        }
        rreturn ResponseEntity.badRequest().body(errors);
    }
    )

}
