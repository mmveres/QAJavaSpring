package ua.univer.lesson11;

import java.util.*;

class Ship{
    private String name;
    private int year;
    static class Point{
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
    private Point point;

    public Ship(String name, int year, Point point) {
        this.name = name;
        this.year = year;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return year == ship.year && name.equals(ship.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", point=" + point +
                '}';
    }
}
class ListNode{
    Ship data;
    ListNode next;

    public ListNode(Ship data) {
        this.data = data;
        next = null;
    }
}
class ListLinkedShip implements Iterable<Ship>{
    private ListNode head;

    public ListLinkedShip() {
        head =null;
    }
    void addFirst(Ship ship){
        ListNode node = new ListNode(ship);
        if (head == null) {head = node;}
        else{
            node.next = head;
            head = node;
        }
    }
    void print(){
        ListNode iter = head;
        while (iter !=null){
            System.out.println(iter.data);
            iter = iter.next;
        }
    }

    @Override
    public Iterator<Ship> iterator() {
        return new ListShipIterator(head);
    }
    class ListShipIterator implements Iterator<Ship>{
        ListNode iter;

        public ListShipIterator(ListNode head) {
            this.iter = head;
        }

        @Override
        public boolean hasNext() {
            return iter !=null;
        }

        @Override
        public Ship next() {
            Ship ship = iter.data;
            iter = iter.next;
            return ship;
        }
    }
}
public class ProgramHash {
    public static void main(String[] args) {
       // testEquals();
        ListLinkedShip shipList = new ListLinkedShip();
        shipList.addFirst(new Ship("Odessa1", 1990, new Ship.Point(1,3)));
        shipList.addFirst(new Ship("Odessa2", 1990, new Ship.Point(1,3)));
        shipList.addFirst(new Ship("Odessa3", 1990, new Ship.Point(1,3)));
        shipList.addFirst(new Ship("Odessa4", 1990, new Ship.Point(1,3)));
        //shipList.print();
        for (Ship ship: shipList) {
            System.out.println(ship);
        }
        Iterator<Ship> iterShip = shipList.iterator();
        while(iterShip.hasNext()){
           Ship ship = iterShip.next();
        }
    }

    private static void testEquals() {
        Ship ship1 = new Ship("Odessa", 1990, new Ship.Point(1,3));
        Ship ship2 = new Ship("Odessa", 1990, new Ship.Point(1,5));
        System.out.println(ship1 == ship2);
        System.out.println(ship1.equals(ship2));

        Set<Ship> ships = new HashSet<>();
        ships.add(ship1);
        ships.add(new Ship("Mikolayv", 1995, new Ship.Point(1,5)));
        ships.add(ship2);
        System.out.println(ships);
        ships.remove(new Ship("Odessa", 1990, null));
        System.out.println(ships);
        System.out.println(ships.contains( new Ship("Odessa", 1990, null)));
    }
}
