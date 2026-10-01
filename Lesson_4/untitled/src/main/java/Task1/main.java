package Task1;

public class main {

    public static void main(String[] args){
        Dog dog1 = new Dog("Бобик", "Дворняга");
        Dog.getCountDog();
        dog1.run(-1);
        dog1.swim(9);

        Cat cat1 = new Cat("Вонючка", "Рыжий");
        Cat cat2 = new Cat("Маня","Серая");
        Cat.getCountCat();
        cat1.run(77);
        cat2.run(201);
        cat1.swim(1);
        cat2.swim(3);

        Animal.getCountAnimal();

        Cat[] cats = new Cat[3];
        cats[0] =new Cat("Вонючка", "Рыжий");
        cats[1] =new Cat("Маня","Серая");
        cats[2] =new Cat("Бариска>", "Белый");

        Cat.addFoodBowl(100);
        cats[0].eating(30);
        cats[1].eating(40);
        cats[2].eating(50);

        for (int i = 0; i < cats.length; i++){
            System.out.println(cats[i].satiety);
        }
    }
}
