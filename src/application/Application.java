package application;

import model.Currency;
import model.CurrencySet;

public class Application {
    public static void main(String[] args) {
        
        Currency euro = new Currency("EUR", "EURO", "€");
        Currency dolar = new Currency("USD", "DOLAR", "$");
        
        CurrencySet set = new CurrencySet();
        set.add(euro);
        set.add(dolar);
        
        for (Currency set1 : set) {
            System.out.println(set1);
        }
        
    }
    
}
