package Task1;

public class Animal {
    protected String animal;
    protected int run;
    protected String nickname;
    protected int swime;
    private static int countAnimal;
    public Animal(String name,String nickname,int run, int swime ){
        this.animal = name;
        this.nickname = nickname;
        this.run = run;
        this.swime = swime;
        countAnimal++;
    }

    public static void getCountAnimal(){
        System.out.println("Животных: " + countAnimal);
    }

    public  void  run(int runDistance){
        if (runDistance <= this.run && runDistance > 0){
            System.out.println(this.nickname + " пробежал дистанцию " + runDistance + "м");
        }
        else if (runDistance > this.run) {
            System.out.println(this.nickname + " не смог пробежать дистанцию " + runDistance + "м" );
        }
        else if (runDistance < 0) {
            System.out.println(this.nickname + " не смог понять сколько ему бежать");
        }
    }

    public void swim(int swimeDistance) {
        if (this.swime == 0){
        System.out.println(this.nickname + " не умеет плавать");
        }
        else{
            if (swimeDistance <= this.swime && swimeDistance > 0) {
                System.out.println(this.nickname + " проплыл дистанцию " + swimeDistance + "м");
            } else if (swimeDistance > this.swime) {
                System.out.println(this.nickname + " не смог проплыть дистанцию " + swimeDistance + "м");
            } else if (swimeDistance < 0) {
                System.out.println(this.nickname + " не смог понять сколько ему плыть");
            }
        }

    }
}
