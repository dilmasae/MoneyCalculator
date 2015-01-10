package control;

import userinterface.ExchangeDialog;

public class ExchangeOperator {
    
    private final ExchangeDialog dialog;
    
    public ExchangeOperator(ExchangeDialog dialog) {
        this.dialog = dialog;
    }

    public void execute() {
        System.out.println(dialog.getExchange().getMoney().getAmount());
        System.out.println(dialog.getExchange().getMoney().getCurrency().getCode());
        System.out.println(dialog.getExchange().getCurrency().getCode());
    }

}
