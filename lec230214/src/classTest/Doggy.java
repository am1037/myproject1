package classTest;

public class Doggy extends Dog {
    public Doggy(String name, String bark, int P) {
        super(name, bark, P);
    }

    @Override
    public void bite(String who) {
        System.out.println(name+ "은 작아서 물 수 없다..");
    }
}
