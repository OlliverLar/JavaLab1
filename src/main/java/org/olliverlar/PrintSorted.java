package org.olliverlar;

import java.util.*;

public class PrintSorted {
    public static void printSorted() {
        LinkedHashMap <String, Integer> priceInterval = PriceInput.getPriceInterval();

        if (priceInterval.isEmpty()) {
            System.out.println("Skriv in priserna först");
        }
        List<Map.Entry<String, Integer>> priceList = new ArrayList<>(priceInterval.entrySet());


        priceList.sort(Comparator.comparingInt(Map.Entry::getValue));
        System.out.println("Priserna sorterade:");
        for (Map.Entry<String, Integer> sortedPrice : priceList) {
            System.out.println("Tid: " + sortedPrice.getKey() + " Pris: " + sortedPrice.getValue() + " öre");
        }
    }
}
