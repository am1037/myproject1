package DecoratorTest;

public class CarCenter implements Car {
    protected Car car;

    public CarCenter(Car car){
        this.car=car;
    }
    @Override
    public void assemble(){
        this.car.assemble();
    }
    @Override
    public void run(){
        this.car.run();
    }
}
