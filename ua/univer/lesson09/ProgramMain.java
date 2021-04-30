package ua.univer.lesson09;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Max
 * @version 1.01
 */
enum Coin{
    Penny(10), Quater(25);

    private int value;
    Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
class Car implements Comparable<Car>{
    private String name;
    private int speed;
    private Engine engine;
    private Salon salon;
    @Override
    public int compareTo(Car o) {
        return this.getSpeed() - o.getSpeed();
    }

    enum FuelType{
        Gasoline(100), Diesel(150), Electric(0), Gas(120);
        private int power;
        FuelType(int power) {
            this.power = power;
        }

        public int getPower() {
            return power;
        }
    }
    static class Engine{
        private FuelType fuel;
        private int power;
        private String name;

        public Engine(FuelType fuel, int power, String name) {
            this.fuel = fuel;
            this.power = power;
            this.name = name;
        }
    }

    class Salon{
       private String typeSalon;

        public Salon(String typeSalon) {
            this.typeSalon = typeSalon;
        }
    }
    /*
    constructor
     */
    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
        engine = new Engine(FuelType.Gasoline,100,"Base");
        salon = new Salon("GreyTextile");
    }

    public Car(String name, int speed, Engine engine, String typeSalon) {
        this.name = name;
        this.speed = speed;
        this.engine = engine;
        this.salon = new Salon(typeSalon);
    }

    /**
     * Метод get
     * @return String
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +

                '}';
    }
}
class CompareCarByName implements Comparator<Car>{

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
public class ProgramMain {
    public static void main(String[] args) {
        Car car = new Car("Ford", 100);
        car.getName();
        Car.Engine vwTDI2 = new Car.Engine(Car.FuelType.Diesel,150,"TDI");
        Car.Salon textileVW = new Car("VW",120).new Salon("Red");
        Car car1 = new Car("BMW",200,
                new Car.Engine(Car.FuelType.Electric,150,"Electro1"),
                "BlueTextile");

        System.out.println(Coin.Quater.getValue());


        int [] mas = {2,4,2,5,12,1};
        Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));

        Car [] cars = {
                new Car("Ford2", 150),
                new Car("Ford1", 200),
                new Car("Ford3", 100)
        };
        Arrays.sort(cars,new CompareCarByName() );
        System.out.println(Arrays.toString(cars));
    }
}
