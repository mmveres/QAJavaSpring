package ua.univer.lesson08.hotels;

public class BathRoom extends AbstractRoom{

    public BathRoom(double square) {
        super(square);
    }

    @Override
    public String toString() {
        return "BathRoom {"+ super.toString()+"} " ;
    }
}
