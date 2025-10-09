package com.backend.FIPETable.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@AllArgsConstructor
@Getter
@Setter
public class Vehicle {
    
    @NotBlank(message = "'mark' is blank.")
    protected String mark;
    @NotBlank(message = "'model' is blank.")
    protected String model;
    @Min(value = 0, message = "'price' cannot be less then 0.")
    protected Double price;
    @Min(value = 1886, message = "The value of 'year' cannot should be less then 1886")
    protected Integer year;
    @Size(min = 8, max = 8, message = "The size of 'fipeCode' should be less then 8 characters")
    protected String fipeCode;
    @NotBlank(message = "'fuel' is blank.")
    protected String fuel;
    @NotBlank(message = "'acronymFuel' is blank.")
    protected String acronymFuel;
    @NotBlank(message = "'referenceMonth' is blank.")
    protected String referenceMonth;

}
