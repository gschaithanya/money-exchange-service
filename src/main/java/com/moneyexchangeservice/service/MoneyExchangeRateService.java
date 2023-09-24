package com.moneyexchangeservice.service;

import com.moneyexchangeservice.entity.MoneyExchangeRate;
import com.moneyexchangeservice.repository.MoneyExchangeRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class MoneyExchangeRateService {

    @Autowired private MoneyExchangeRateRepository moneyExchangeRateRepository;

    public MoneyExchangeRate getExchangeRate(String fromCurrency, String toCurrency) {
        Optional<MoneyExchangeRate> rateOptional = moneyExchangeRateRepository.findByFromCurrencyAndToCurrency(fromCurrency, toCurrency);

        if (rateOptional.isPresent()) {
            return rateOptional.get();
        } else {
            // Handle rate not found
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Exchange rate not found");
        }
    }


}
