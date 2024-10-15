package workshop.spring.api.model;

import java.util.List;

public record StudentDTORead(Long id, String name, List<Module> modules) { }