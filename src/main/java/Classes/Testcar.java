package Classes;

public class Testcar {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "Test car";
        Toyota toyota = new Toyota();
        //toyota.isReliable = false;
        System.out.println(toyota.isReliable);
        toyota.startEngine();
    }
}
