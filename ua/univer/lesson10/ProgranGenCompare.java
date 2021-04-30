package ua.univer.lesson10;

class Car implements Comparable<Car>{
    private String name;
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public int compareTo(Car o) {
        return this.speed - o.speed;
    }
}
public class ProgranGenCompare {
    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }

    public static void main(String[] args) {
        String[] strs = {"a","d","c"};
        System.out.println( countGreaterThan(strs, "b"));
        Car [] cars = {new Car("Ford1",100),
                new Car("Ford2",150),
                new Car("Ford3",180),
                new Car("Ford4",180)
        };
        System.out.println( countGreaterThan(cars, new Car("BMW",120)));
    }
}
