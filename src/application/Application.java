package application;

import control.ExchangeOperator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import model.CurrencySet;
import persistence.CreateConnection;
import sqlite.SqliteConnection;
import swing.ApplicationFrame;

public class Application {
    public static void main(String[] args) {
        
        Connection connection = CreateConnection.loadConection("money-calculator.db");
        SqliteConnection sqlite = new SqliteConnection(connection);
        CurrencySet currencySet = sqlite.loadCurrencySet();
        ApplicationFrame frame = new ApplicationFrame(currencySet);
        
        frame.register("Calcular", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                new ExchangeOperator(frame.getDialog()).execute(sqlite);
            }    
        });  
    }  
}
