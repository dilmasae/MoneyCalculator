package application;

import mock.EchangeRateLoaderMock;
import model.Currency;
import model.ExchangeRate;
import model.Money;
import process.Exchanger;

public class Application {
    public static void main(String[] args) {
        
        ExchangeRate exchangeRate = new EchangeRateLoaderMock().load(new Currency("EUR", "EURO", "€"), 
                new Currency("USD", "DOLAR", "$"));
      
        Money money = Exchanger.exchanceRate(new Money(1.2, new Currency("EUR", "EURO", "€")), 
                exchangeRate);
        System.out.println(money);
    }
    
}
