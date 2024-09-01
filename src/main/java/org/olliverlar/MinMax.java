
package org.olliverlar;


import java.util.*;

public class MinMax {
    public static void minMax() {
        LinkedHashMap<String, Integer> priceInterval = PriceInput.getPriceInterval();

        if (priceInterval.isEmpty()) {
            System.out.println("Skriv in priser först.");
            return;
        }

        double averagePrice = calculateAveragePrice(priceInterval);

        List<Map.Entry<String, Integer>> priceList = new ArrayList<>(priceInterval.entrySet());

        priceList.sort(Comparator.comparingInt(Map.Entry::getValue));

        if (priceList.size() >= 2) {
            Map.Entry<String, Integer> smallest1 = priceList.get(0);
            Map.Entry<String, Integer> smallest2 = priceList.get(1);

            System.out.println("De två billigaste tiderna:");
            System.out.println("1. Tid: " + smallest1.getKey() + " Pris: " + smallest1.getValue() + " öre");
            System.out.println("2. Tid: " + smallest2.getKey() + " Pris: " + smallest2.getValue() + " öre");
        } else {
            System.out.println("Något gick snett, se till att du har skrivit in minst 2 priser!");
        }

        System.out.println("Medelpriset är: " + averagePrice + " öre");
    }
    private static double calculateAveragePrice(LinkedHashMap<String, Integer> priceInterval) {
        int totalPrices = 0;
        for (Integer price : priceInterval.values()) {
            totalPrices += price;
        }

        return (double) totalPrices / priceInterval.size();
    }}
