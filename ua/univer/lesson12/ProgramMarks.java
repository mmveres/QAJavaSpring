package ua.univer.lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class NotMarkException extends Exception{
    public NotMarkException(String message) {
        super(message);
    }
}
public class ProgramMarks {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("enter int");
            String strFromCon = br.readLine();
            try {
                int x = Integer.parseInt(strFromCon);
                System.out.println(x);
                if (x < 3 || x > 12) {
                    throw new NotMarkException(" x not mark");
                }
                System.out.println(" x mark = "+x);
                break;
            } catch (NotMarkException em){
                System.err.println(em.getMessage());
            } catch (NumberFormatException e) {
                System.err.println("Error not int");
            }
        }
    }
}
