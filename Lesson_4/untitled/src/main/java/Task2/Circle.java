package Task2;

public class Circle implements Figurs{
    private int radius;
    private String colorFill;
    private String colorBorder;

    public Circle(int radius, String colorBorder, String colorFill){
        this.colorBorder = colorBorder;
        this.colorFill = colorFill;
        this.radius = radius;
    }
    @Override
    public double perimeter(){
        double perimeter;
        perimeter = Math.round(this.radius*2*Math.PI);
        return perimeter;
    }

    @Override
    public double area(){
        double area = Math.round(Math.PI * this.radius * this.radius);
        return area;
    }

    @Override
    public String printColorFill(){
        return colorFill;
    }

    @Override
    public String printColorBolder(){
        return colorBorder;
    }
}
