package ua.univer.lesson08.hotels;

public class Hall extends AbstractRoom{

    public Hall(double square) {
        super(square);
    }

    @Override
    public String toString() {
        return "Hall{" + super.toString()+'}';
    }
}
