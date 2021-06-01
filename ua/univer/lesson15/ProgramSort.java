package ua.univer.lesson15;
import  java.util.*;

class Country implements Comparable<Country>{
    private String name;
    private int count;
    private double square;

    public Country(String name, int count, double square) {
        this.name = name;
        this.count = count;
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return "\nCountry{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", square=" + square +
                '}';
    }

    @Override
    public int compareTo(Country o) {
        return this.getCount()-o.getCount();
    }
}
public class ProgramSort {
    public static void main(String[] args) {
        int [] mas = {1,12,3,14,5,3};
        Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));

        Country [] countries = {
                new Country("A",112,223),
                new Country("C",111,221),
                new Country("B",113,222),
        };

        //Arrays.sort(countries, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        Arrays.sort(countries, Comparator.comparing(Country::getName));

        System.out.println(Arrays.toString(countries));

    }
}
