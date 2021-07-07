package pl.pasekdawid.emergency.report.service.infrastructure.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import pl.pasekdawid.emergency.report.service.api.DefaultResponse;

import java.util.Arrays;
import java.util.UUID;

@Slf4j
@ControllerAdvice
public class DefaultExceptionHandler {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public ResponseEntity<DefaultResponse> handleUnexpectedExceptions(Exception exception) {
        log.info("Unexpected error occurred.");
        log.info(exception.getLocalizedMessage());
        log.info(Arrays.toString(exception.getStackTrace()));
        return new ResponseEntity<>(
                new DefaultResponse(UUID.randomUUID()),
                HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
