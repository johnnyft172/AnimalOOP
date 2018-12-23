package zootopiaLand;

public class Animal {

    int age;
    String gender;
    int weightInLbs;

    public  Animal(int age, String gender, int weightInlbs) {
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weightInlbs;
    }

    public void eat(){
        System.out.println("I love seeing animal eat like a pig");
    }

    public void sleep(){
        System.out.println("Animal sleeping is soo cuteee");


    }
}
