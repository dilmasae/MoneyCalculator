package persistence;

import model.Currency;
import model.ExchangeRate;

public class ExchangeRateLoader {
    
    private final ExchangeRate exchangeRate;

    public ExchangeRateLoader(Currency from, Currency to, double rate) {
        this.exchangeRate = new ExchangeRate(from,to,rate);
    }
    public void load(){
    }
}
