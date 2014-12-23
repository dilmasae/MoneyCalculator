package application;

import mock.CurrencySetLoaderMock;
import model.Currency;
import model.CurrencySet;
import persistence.CurrencySetLoader;

public class Application {
    public static void main(String[] args) {
      
        CurrencySetLoaderMock mock = new CurrencySetLoaderMock();
        CurrencySet set = mock.loadCurrencySet();
        for (Currency set1 : set) {
            System.out.println(set1);
        }
        
        
    }
    
}
