package pl.pasekdawid.def.service.api;

import lombok.Value;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Value
public class DefaultResponse {

    @NotNull
    UUID id;

}
