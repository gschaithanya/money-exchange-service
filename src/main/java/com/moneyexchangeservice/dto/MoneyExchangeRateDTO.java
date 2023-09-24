package com.moneyexchangeservice.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Table;


@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class MoneyExchangeRateDTO {

    private int id;
    private String fromCurrency;
    private String toCurrency;
    private Double exchangeRate;
}
