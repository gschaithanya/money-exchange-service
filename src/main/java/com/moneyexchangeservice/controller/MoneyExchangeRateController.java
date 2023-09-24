package com.moneyexchangeservice.controller;

import com.moneyexchangeservice.entity.MoneyExchangeRate;
import com.moneyexchangeservice.service.MoneyExchangeRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoneyExchangeRateController {

    @Autowired
    private MoneyExchangeRateService moneyExchangeRateService;

    @GetMapping("/rate")
    public ResponseEntity<MoneyExchangeRate> getExchangeRate(
            @RequestParam("fromCurrency") String fromCurrency,
            @RequestParam("toCurrency") String toCurrency) {
       MoneyExchangeRate exchangeRate= moneyExchangeRateService.getExchangeRate(fromCurrency, toCurrency);
        return ResponseEntity.ok(exchangeRate);
    }
}
