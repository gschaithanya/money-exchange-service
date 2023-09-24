package com.moneyexchangeservice.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@Table
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class MoneyExchangeRate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fromCurrency;
    private String toCurrency;
    private Double exchangeRate;

}
