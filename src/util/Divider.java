package util;

public class Divider {

    public static void separator() {
        separator("-", 40);
    }

    public static void separator(String symbol) {
        separator(symbol, 40);
    }

    public static void separator(int countSymbol) {
        separator("-", countSymbol);
    }

    public static void separator(String symbol, int countSymbol) {
        System.out.println(symbol.repeat(countSymbol));
    }
}
