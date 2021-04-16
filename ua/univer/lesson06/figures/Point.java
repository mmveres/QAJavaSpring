package ua.univer.lesson06.figures;

public class Point{
    private int x;
    private int y;

    public Point() {
      //  this.x = 0;
      //  this.y = 0;
        this(0,0);
    }

    public Point(int x) {
     //   this.x = x;
     //   this.y = 1;
        this(x,1);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        if (x > 0) this.x = x;
        else
            throw new IllegalArgumentException();
        //this.x = 0;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void print(){
        System.out.println("Point ("+this.getX()+","+ this.getY()+")");
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
