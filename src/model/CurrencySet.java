package model;

import java.util.HashSet;

public class CurrencySet extends HashSet<Currency> implements Iterable<Currency> {

    public CurrencySet() {
        super();
    }

    public Currency[] getCurrency() {
        return this.toArray(new Currency[this.size()]);
    }

    @Override
    public boolean add(Currency currency) {
        return super.add(currency); 
    }

    public boolean remove(Currency currency) {
        return super.remove(currency);
    } 
}
