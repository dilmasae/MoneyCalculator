package swing;

import static java.awt.BorderLayout.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.CurrencySet;
import userinterface.ExchangeDialog;

public class ApplicationFrame extends JFrame {
    
    private final CurrencySet currencySet;
    private Map<String,ActionListener> listeners;
    private ExchangeDialog exchangeDialog;

    public ApplicationFrame(CurrencySet currencySet) {
        super();
        this.currencySet = currencySet;
        this.listeners = new HashMap<>();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setTitle("Money Calculator");
        this.createWidgets();
        this.setVisible(true);
    }

    public void register(String command, ActionListener actionListener) {
        this.listeners.put(command, actionListener);
    }

    public ExchangeDialog getDialog() {
        return exchangeDialog;
    }

    private void createWidgets() {
        this.add(createCalculateButton(), SOUTH);
        this.add(createDialog());
    }

    private JButton createCalculateButton() {
        JButton button = new JButton("Calcular");
        button.addActionListener(createListener("Calcular"));
        return button;
    }

    private ActionListener createListener(String text) {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                listeners.get(text).actionPerformed(event);
            }
        };
    }

    private JPanel createDialog() {
        ExchangeDialogPanel panel = new ExchangeDialogPanel(currencySet);
        this.exchangeDialog = panel;
        return panel;
    }

    
    
    
}
