package ua.univer.lesson08;

public class Program {

    public static void main(String[] args) {
        Circle f1 = new Circle(1,2,5);
        Rectangle f2 = new Rectangle(4,6);
        AbstractFigure[] masfig = {f1, f2, new Circle(1,3,7)};
        for (int i = 0; i < masfig.length; i++) {
            masfig[i].show();

        }
        FigureList figureList = new FigureList(masfig);
        figureList.showPerimetr();
        AbstractFigure maxPerimetrFigure = figureList.getMaxPerimetr();
      //  maxPerimetrFigure.show();
        System.out.println(maxPerimetrFigure);
    }
}
