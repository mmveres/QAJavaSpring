package ua.univer.lesson08;

public abstract class AbstractFigure {
    public abstract double perimetr();
    public abstract double square();
    public void show(){
        System.out.println(this.getClass().getSimpleName());
        System.out.println("p ="+this.perimetr());
        System.out.println("s ="+this.square());
    }
}
