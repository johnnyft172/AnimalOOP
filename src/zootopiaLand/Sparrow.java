package zootopiaLand;

public class Sparrow extends Bird implements Flyable {
    public Sparrow(int age, String gender, int weightInlbs) {
        super(age, gender, weightInlbs);
    }


    public void fly() {
        System.out.println("Sparrow is happy because it can fly high like an eagle");

    }
}
