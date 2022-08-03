package com.validationtest.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class Passenger {

    private Long id;
    private String firstName;

    @NotNull(message = "Last name cannot be null")
    @Size(min = 2, max = 10, message = "Last name must be between 2 and 10 characters long")
    private String lastName;

}
