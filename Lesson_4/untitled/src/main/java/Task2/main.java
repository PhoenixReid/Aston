package Task2;

public class main {
    public static void main(String[] args){
        Circle circle = new Circle(11, "Красный ", "Синий");
        circle.info();
        Triangle triangle =new Triangle(11, 10, 7, "Фиолетовый", "Серый");
        triangle.info();
        Rectangle rectangle  =new Rectangle(5, 3 ,"Белый", "Чёрный");
        rectangle.info();
    }
}
