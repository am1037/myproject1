package ClassTest;

public class Main_3 {
    public static void main(String[] args) {
        Mask.totalMask();
        Mask m1 = new Mask("흰색", 3000, 5);
        Mask m2 = new Mask("검은색", 2500, 2);
        Mask.totalMask();
        System.out.println("--------------------------------------------");

        Daughter.setDad_money(10000);
        Daughter.papaMoney();
        Daughter d1 = new Daughter("도순이", 2000);
        Daughter d2 = new Daughter("레순이", 2002);
        Daughter d3 = new Daughter("파순이", 2004);
        Daughter.papaMoney();
        Daughter.daughterAssemble();
        System.out.println("--------------------------------------------");

        Car car = new Car();
        Truck truck = new Truck();
        CoffeeTruck ct = new CoffeeTruck();
        car.run();
        truck.run();
        ct.run();
        System.out.println("--------------------------------------------");
    }
}
