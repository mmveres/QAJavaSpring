package ua.univer.lesson08;

public class Rectangle extends AbstractFigure {
    private int sideA;
    private  int sideB;
    public Rectangle(int sideA, int sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    public double perimetr() {
        return 2*(sideA+sideB);
    }

    @Override
    public double square() {
        return sideA*sideB;
    }

    @Override
    public String toString() {
        return "Rectangle: "+this.perimetr()+", "+this.square();
    }
}
