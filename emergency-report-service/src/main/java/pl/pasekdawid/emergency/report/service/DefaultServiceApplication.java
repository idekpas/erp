package pl.pasekdawid.emergency.report.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import pl.pasekdawid.emergency.report.service.infrastructure.config.DefaultConfig;

@EnableConfigurationProperties(DefaultConfig.class)
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) // [todo] - add database connection
public class DefaultServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DefaultServiceApplication.class, args);
    }
}
