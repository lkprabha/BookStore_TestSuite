package Utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileHandler {

    /*
     *This method reads data from a csv file and returns string array containing the required data.
     *Parameters required for this array are CSV path and the number of columns in the csv file
     */
    public static String[] csvDataRead(String CSV_PATH, int columnCount) throws IOException {
        String line = "";
        String values[] = new String[columnCount];
        try {
            BufferedReader br = new BufferedReader(new FileReader(CSV_PATH));

            while((line=br.readLine()) != null) {
                values = line.split(",");
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        return values;
    }
}