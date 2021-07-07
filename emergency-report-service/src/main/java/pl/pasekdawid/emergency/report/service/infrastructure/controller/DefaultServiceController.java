package pl.pasekdawid.emergency.report.service.infrastructure.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pasekdawid.emergency.report.service.application.DefaultService;

@Slf4j
@RestController
@RequestMapping("/default-service/api/v1")
public class DefaultServiceController {

    private final DefaultService defaultService;

    public DefaultServiceController(DefaultService defaultService) {
        this.defaultService = defaultService;
    }
}
