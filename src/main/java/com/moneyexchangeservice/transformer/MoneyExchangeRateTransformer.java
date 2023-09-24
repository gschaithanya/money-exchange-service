package com.moneyexchangeservice.transformer;

import com.moneyexchangeservice.dto.MoneyExchangeRateDTO;
import com.moneyexchangeservice.entity.MoneyExchangeRate;

public class MoneyExchangeRateTransformer {

    public static MoneyExchangeRate transform(MoneyExchangeRateDTO moneyExchangeRateDTO){
      return  MoneyExchangeRate.builder().exchangeRate(
                moneyExchangeRateDTO.getExchangeRate())
                .id(moneyExchangeRateDTO.getId())
                .toCurrency(moneyExchangeRateDTO.getToCurrency())
                .fromCurrency(moneyExchangeRateDTO.getFromCurrency())
                .build();
    }

    public static MoneyExchangeRateDTO transform(MoneyExchangeRate moneyExchangeRate){
        return MoneyExchangeRateDTO.builder()
                .exchangeRate(moneyExchangeRate.getExchangeRate())
                .fromCurrency(moneyExchangeRate.getFromCurrency())
                .toCurrency(moneyExchangeRate.getToCurrency())
                .id(moneyExchangeRate.getId()).build();
    }
}
