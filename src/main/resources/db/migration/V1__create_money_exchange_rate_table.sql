CREATE TABLE money_exchange_rate  (
    id INT PRIMARY KEY,
    from_currency VARCHAR(3) NOT NULL,
    to_currency VARCHAR(3) NOT NULL,
    exchange_rate DECIMAL(10, 4) NOT NULL
);

INSERT INTO money_exchange_rate (id,from_currency, to_currency, exchange_rate)
VALUES ('1','USD', 'EUR', 0.85),
    ('2','USD', 'GBP', 0.72),
    ('3','EUR', 'USD', 1.18),
    ('4','GBP', 'USD', 1.39),
    ('5','USD', 'INR', 74.43),
    ('6','EUR', 'INR', 87.57),
    ('7','GBP', 'INR', 103.25);