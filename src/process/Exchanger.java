
package process;

import model.ExchangeRate;
import model.Money;

public class Exchanger {
    
    public static Money exchanceRate(Money money, ExchangeRate exchangeRate){
        return new Money(CalculateAmount(money, exchangeRate), exchangeRate.getToCurrency());
    }

    private static double CalculateAmount(Money money, ExchangeRate exchangeRate) {
       return money.getAmount() * exchangeRate.getRate();
    }
}
