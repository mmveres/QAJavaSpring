package ua.univer.lesson08.hotels;

public class Room extends AbstractRoom{
    public Room(double square) {
        super(square);
    }

    @Override
    public String toString() {
        return "Room{"+ super.toString()+"} " ;
    }
}
