package streamapi;

import java.util.*;

public class StockPriceLogger {

    public static void main(String[] args) {

        List<Double> stockPrices = Arrays.asList(
            120.5, 121.3, 119.8, 122.6, 123.1, 121.9
        );

        System.out.println("Live Stock Prices:");

        stockPrices.forEach(price ->
            System.out.println("Stock Price: " + price)
        );
    }
}

