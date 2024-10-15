package workshop.spring.api.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record StudentDTOWrite(
    @NotNull(message = "Name must not be null")
    @Size(min = 1, message = "Name must not be empty")
    String name
) { }
