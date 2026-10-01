package Task1;

public class Cat extends Animal{
    private String color;
    public boolean satiety;
    private static int countCat;
    private static int foodInBowl;
    public Cat(String nickname, String color){
        super("Кот", nickname, 200, 0);
        this.color = color;
        countCat++;
        this.satiety = false;
    }

    public static void getCountCat(){
        System.out.println("Котов: " + countCat);
    }

    public void eating(int eat){
    if(foodInBowl >= eat){
        foodInBowl = foodInBowl - eat;
        this.satiety = true;
        }
    }

    public static void addFoodBowl(int countFood){
        foodInBowl = foodInBowl + countFood;
    }

}


