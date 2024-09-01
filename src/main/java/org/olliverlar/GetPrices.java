package org.olliverlar;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;

public class GetPrices {
    public static void getPrices() {
        String csvFilePath = "C:\\SkolaJS\\Laboration-1-2024\\src\\main\\resources\\time_price_data.csv";


        try (CSVReader reader = new CSVReader(new FileReader(csvFilePath))) {
            String[] nextLine;
            boolean first = true;
            while((nextLine = reader.readNext()) != null) {
            for (String cell : nextLine) {
                if (first) {
                    System.out.println(cell + "\t\t");
                }
                else System.out.println(cell + "\t");
            }
            first = false;
                System.out.println();
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }   catch(Exception e) {
            e.printStackTrace();
            System.err.println("CSV validation error: " + e.getMessage());
        }
    }
}
