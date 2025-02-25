package util;

public class CurrencyConverter {

    public static double dollarPrice;
    public static double amount;

    public static String convert(){

        return "Amount to be paid in reais = " + String.format("%.2f", dollarPrice * amount * 1.06);

    }
}
