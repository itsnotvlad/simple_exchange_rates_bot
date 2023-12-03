package ru.kamalov.simple_exchange_rates_bot.service;

import ru.kamalov.simple_exchange_rates_bot.exception.ServiceException;

public interface ExchangeRatesService {

    String getUSDExchangeRate() throws ServiceException;

    String getEURExchangeRate() throws ServiceException;

    String getGBRExchangeRate() throws ServiceException;
}
