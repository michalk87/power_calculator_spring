package com.michal_kijowski.power_calculator_spring.service;

import com.michal_kijowski.power_calculator_spring.model.Device;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


@Service
public class PriceCalculateService {

    private final static BigDecimal PRICE_KWH = new BigDecimal(0.55);
    private final static BigDecimal ONE_THOUSAND = new BigDecimal(1000);

    public Device calculatePrice (Device device){

        BigDecimal oneHour = new BigDecimal(device.getPower()).divide(ONE_THOUSAND).multiply(PRICE_KWH).setScale(2, BigDecimal.ROUND_HALF_UP);

        BigDecimal oneDay = oneHour.multiply(new BigDecimal(24)).setScale(2, BigDecimal.ROUND_HALF_UP);

        device.setPriceForOneHour(oneHour);
        device.setPriceForOneDay(oneDay);

        return device;

    }







}
