package DecoratorTest;

public class Main {
    public static void main(String[] args) {
        Car c = new NormalCar();
        c.assemble();
        c.run();
        c = new SportsCar(c);
        c.assemble();
        c.run();
        c = new LuxuryCar(c);
        c.assemble();
        c.run();
    }
}
