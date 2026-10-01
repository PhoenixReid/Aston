package Task2;

public class Rectangle implements Figurs{
    private int length;
    private int width;
    private String colorFill;
    private String colorBorder;

    public Rectangle(int length,int width, String colorBorder, String colorFill){
        this.colorBorder = colorBorder;
        this.colorFill = colorFill;
        this.length = length;
        this.width = width;
    }
    @Override
    public double perimeter(){
        double perimeter;
        perimeter = this.length * 2 + this.width * 2;
        return  perimeter;
    }

    @Override
    public double area(){
        double area = this.length * this.width;
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
