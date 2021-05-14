package ua.univer.lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ProgramEx {
    public static Logger logger = Logger.getLogger("ProgramEx");
    static {
        try {
            FileHandler fh = new FileHandler("programEx.log",true);
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);
            logger.setLevel(Level.WARNING);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int div() {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            System.out.println("enter n ");
            int n = Integer.parseInt(br.readLine());
            logger.info("enter n = "+n);
            System.out.println("enter k ");
            int k = Integer.parseInt(br.readLine());
            logger.info("enter k = "+k);
            return n / k;
        } catch (NumberFormatException | IOException e) {
            System.out.println(e.getMessage());
            return -1;
        } catch (ArithmeticException e) {
            logger.log(Level.SEVERE,"divide k/n ",e);
            throw e;
        } catch (Exception e) {
            return -3;
        }
    }

    public static void main(String[] args) {

        System.out.println(div());

    }
}
