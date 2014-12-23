package application;

import mock.EchangeRateLoaderMock;
import model.Currency;
import model.ExchangeRate;

public class Application {
    public static void main(String[] args) {
      
        EchangeRateLoaderMock mock = new EchangeRateLoaderMock();
        
        ExchangeRate exchangeMock = mock.load(new Currency("USD", "DOLAR", "$"),
                new Currency("EUR", "EURO", "€"));
        
        System.out.println(exchangeMock.getRate());
        
        
    }
    
}
