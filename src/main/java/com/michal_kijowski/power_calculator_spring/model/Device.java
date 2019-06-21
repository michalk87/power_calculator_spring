package com.michal_kijowski.power_calculator_spring.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Device {

    private Long power;
    private BigDecimal priceForOneHour;
    private BigDecimal priceForOneDay;
}
