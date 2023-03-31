package com.knoldus.question3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StockWithHighestPrice
{
    public static String findStockSymbolWithHighestPrice(HashMap<String, Double>stockSymbolsWithPrices)
    {
        Double maxPrice = stockSymbolsWithPrices.values().stream().max(Double::compare).get();
        String symbolWithMaxPrice=null;
        for (Map.Entry<String, Double> entry : stockSymbolsWithPrices.entrySet()) {
            if (entry.getValue().equals(maxPrice)) {
                symbolWithMaxPrice =  entry.getKey();
            }
        }
        return symbolWithMaxPrice;
    }

    public static void main(String[] args) {
        HashMap<String, Double>stockSymbolsWithPrices = new HashMap<>();
        Scanner takeInput = new Scanner(System.in);
        String symbol;
        Double price;
        System.out.println("Enter number of stocks to enter");
        Integer numberOfStocks = takeInput.nextInt();
        for(Integer count=0; count<numberOfStocks; count++)
        {
            System.out.println("Enter the symbol: ");
            symbol=takeInput.nextLine();
            symbol=takeInput.nextLine();
            System.out.println("Enter the price: ");
            price = takeInput.nextDouble();
            stockSymbolsWithPrices.put(symbol, price);
        }
        String symbolWithMaxPrice = StockWithHighestPrice.findStockSymbolWithHighestPrice(stockSymbolsWithPrices);
        System.out.println("Symbol with highest  price: "+symbolWithMaxPrice);
    }
}
