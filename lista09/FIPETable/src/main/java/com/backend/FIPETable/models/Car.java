package com.backend.FIPETable.models;

import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Car extends Veicle {
    
    @Min(value = 1985)
    protected Short year;

    public Car(){
        super(mark, model, price, year, fipeCode, fuel, acronymFuel, referenceMonth);
    }

}
