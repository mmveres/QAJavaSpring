package ua.univer.lesson07.people;

public class Person implements DiscountAble{
    private String name;
    private int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getDiscount(){
        return 1;
    }

    public double getDiscount(double totalCost){
        if ( totalCost > 50 ) return 0.8 * getDiscount();
        else return getDiscount();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
