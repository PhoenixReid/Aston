package Task2;

public class Triangle implements Figurs{
    private int side1;
    private int side2;
    private int side3;
    private String colorFill;
    private String colorBorder;

    public Triangle(int side1,int side2,int side3, String colorBorder, String colorFill){
        this.colorBorder = colorBorder;
        this.colorFill = colorFill;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double perimeter(){
        double perimeter;
        perimeter = this.side1 + this.side2 + this.side3;
        return  perimeter;
    }

    @Override
    public double area(){
        int halfMeter = (this.side1 + this.side2 + this.side3)/2;
        double area = Math.round(Math.sqrt(halfMeter*(halfMeter-this.side1)*(halfMeter-this.side2)*(halfMeter-this.side3)));
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
