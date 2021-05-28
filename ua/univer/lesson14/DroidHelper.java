package ua.univer.lesson14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DroidHelper {
    public static void writeDroidToFile(Droid d1, String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        fw.write(d1.toString());
        fw.close();
    }
    public static Droid getDroidFromFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String str = br.readLine();
        String [] words = str.split(";");
        String name = words[0];
        int armorAmount = Integer.parseInt(words[1]);
        int weaponAmount = Integer.parseInt(words[2]);
        int weaponPower = Integer.parseInt(words[3]);

        return new Droid(name,armorAmount,weaponAmount,weaponPower);
    }

    public static void write10DroidToFile() throws IOException {
        for (int i = 0; i < 10; i++) {
            DroidHelper.writeDroidToFile(
                    new Droid("DroidName"+i,100,20,50),
                    "droid"+i+".csv"
            );
        }
    }

    public static void writeDroidsToFiles(Droid[] droids) throws IOException {
        for (int i = 0; i < droids.length; i++) {
            DroidHelper.writeDroidToFile(
                    droids[i],
                    "droid"+i+".csv"
            );
        }
    }

    public static void writeDroidsToFileCSV(Droid[] droids, String fileName) throws IOException {
       try( FileWriter fw = new FileWriter(fileName);) {
           for (int i = 0; i < droids.length; i++) {
               fw.write(droids[i].toStringCSV()+"\r\n");
           }
       }
    }
}
