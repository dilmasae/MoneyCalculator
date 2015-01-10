package mock;

import model.Currency;
import model.CurrencySet;
import persistence.CurrencySetLoader;

public class CurrencySetLoaderMock implements CurrencySetLoader {
   
    @Override
    public CurrencySet loadCurrencySet() {

        CurrencySet currencySet = new CurrencySet();
        currencySet.add(new Currency("EUR", "EURO", "€"));
        currencySet.add(new Currency ("USD", "DOLAR", "$"));
        
        return currencySet;
        
    }
 
}
