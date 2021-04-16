package ua.univer.lesson08;

public class FigureList {
    private AbstractFigure[] masfig;
    private int count ;

    public FigureList() {
        this.masfig = new AbstractFigure[10];
        this.count = 0;
    }

    public void add (AbstractFigure figure){
        if (count == masfig.length) throw new ArrayIndexOutOfBoundsException();
        masfig[count] = figure;
        count++;
    }

    public FigureList(AbstractFigure[] masfig) {
        this.masfig = masfig;
        this.count = masfig.length;
    }

    public void showPerimetr(){
        System.out.println("**************");
        for (AbstractFigure figure: masfig) {
            System.out.println(figure.perimetr());
        }
    }
    public AbstractFigure getMaxPerimetr(){
        AbstractFigure maxPerimetrFigure = masfig[0];
        for (AbstractFigure figure: masfig) {
            if (figure.perimetr()> maxPerimetrFigure.perimetr())
                maxPerimetrFigure = figure;
        }
        return maxPerimetrFigure;
    }

}
