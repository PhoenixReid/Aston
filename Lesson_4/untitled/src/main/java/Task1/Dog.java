package Task1;

public class Dog extends Animal {
    private  String breed;
    public static int countDog;
    public Dog(String nickname, String breed){
        super("Собака",nickname,500,10);
        this.breed = breed;
        countDog++;
    }

    public static void getCountDog(){
        System.out.println("Собак: " + countDog);
    }
}
