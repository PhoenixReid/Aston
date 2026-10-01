package Task2;

interface Figurs {
        double perimeter();
        double area();
        String printColorFill();
        String printColorBolder();
        default void info(){
                System.out.println(perimeter()+ " " + area()+ " " + printColorFill() + " " + printColorBolder());
        }
}
