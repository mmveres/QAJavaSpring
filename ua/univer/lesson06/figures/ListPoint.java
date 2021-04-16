package ua.univer.lesson06.figures;

public class ListPoint {
   private Point [] points;
   private int count;
   public ListPoint(){
       points = new Point[10];
       count = 0;
   }
   public void add(Point p){
       points[count] = p;
       count++;
   }
   public void print(){
       for (int i = 0; i < count; i++) {
           System.out.println(points[i]);
       }
   }
   public Point getMaxXcoord(){
       Point maxXcoord = points[0];
       for (int i = 0; i < count; i++) {
           if (maxXcoord.getX()<points[i].getX())
               maxXcoord = points[i];
       }
       return maxXcoord;
   }
}
