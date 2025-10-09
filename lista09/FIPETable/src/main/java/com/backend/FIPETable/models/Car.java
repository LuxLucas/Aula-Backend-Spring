package com.backend.FIPETable.models;

import jakarta.validation.constraints.Min;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Car extends Vehicle {
    
    @Min(value = 1985)
    protected Integer year;

}
