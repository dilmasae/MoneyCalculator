package mock;

import model.Currency;
import model.ExchangeRate;
import persistence.ExchangeRateLoader;

public class EchangeRateLoaderMock implements ExchangeRateLoader {

    @Override
    public ExchangeRate load(Currency fromCurrency, Currency toCurrency) {
        if(fromCurrency.getCode().equals("EUR")) 
            return new ExchangeRate(fromCurrency, toCurrency, 1.2);
        else return new ExchangeRate(fromCurrency, toCurrency, 1.9);
    }
    
}
