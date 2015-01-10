package control;

import javax.swing.JOptionPane;
import model.ExchangeRate;
import model.Money;
import process.Exchanger;
import sqlite.SqliteConnection;
import userinterface.ExchangeDialog;

public class ExchangeOperator {
    
    private final ExchangeDialog dialog;
    
    public ExchangeOperator(ExchangeDialog dialog) {
        this.dialog = dialog;
    }

    public void execute( SqliteConnection sqlite) {
        
        ExchangeRate exchangeRate = sqlite.getExchangeRate(
                dialog.getExchange().getMoney().getCurrency(), 
                dialog.getExchange().getCurrency());
        
        Money money = Exchanger.exchanceRate(dialog.getExchange().getMoney(), exchangeRate);
        
        JOptionPane.showMessageDialog(null, money); 
    }
}
