package com.moneyexchangeservice.repository;

import com.moneyexchangeservice.entity.MoneyExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MoneyExchangeRateRepository  extends JpaRepository<MoneyExchangeRate,Long> {
    Optional<MoneyExchangeRate> findByFromCurrencyAndToCurrency(String fromCurrency, String toCurrency);
}
