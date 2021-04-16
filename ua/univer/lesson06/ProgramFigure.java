package ua.univer.lesson06;

import ua.univer.lesson06.figures.Line;
import ua.univer.lesson06.figures.ListPoint;
import ua.univer.lesson06.figures.Point;

public class ProgramFigure {
    public static void main(String[] args) {
        Point p = new Point(1,2);
        System.out.println(p);

        Point p2 = new Point();
        System.out.println(p2);

        Line line1 = new Line(p,p2);
        System.out.println(line1);

        Line line2 = new Line();
        System.out.println(line2);

        System.out.println(line2.getLength());

        ListPoint listPoints = new ListPoint();
        listPoints.add(p);
        listPoints.add(p2);
        listPoints.print();
        System.out.println(listPoints.getMaxXcoord());

        ListPoint listPoints2 = new ListPoint();
        listPoints.add(new Point(p.getX(), p.getY()));
        listPoints.add(new Point(3,4));
    }
}
