package application;

import control.ExchangeOperator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mock.CurrencySetLoaderMock;
import model.CurrencySet;
import swing.ApplicationFrame;

public class Application {
    public static void main(String[] args) {
        
        
        CurrencySetLoaderMock currencySetMock = new CurrencySetLoaderMock(); 
        CurrencySet currencySet = currencySetMock.loadCurrencySet();
        ApplicationFrame frame = new ApplicationFrame(currencySet);
        
        frame.register("Calcular", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                new ExchangeOperator(frame.getDialog()).execute();
            }
            
        });
       
    }
    
}
