package com.bank;

public enum Currency {
    EUR,
    GBP,
    USD;

    // Further advance features that could be implemented:
//    EUR("eur", "EURO"),
//    GDP("gdp", "GB"),
//    USD("usd", "$");
//
//    String currency;
//
//    String currency2;
//
//    Currency(String currency, String currency2) {
//        this.currency = currency;
//    }
//
//    @Override
//    public String toString() {
//        return currency;
//    }

    public static void main(String[] args) {
        Currency gbp =Currency.valueOf("GBP");
        System.out.println(gbp);
        System.out.println(Currency.valueOf("GBP"));
        System.out.println(Currency.valueOf("EUR"));
        System.out.println(Currency.valueOf("USD"));

    }
}
