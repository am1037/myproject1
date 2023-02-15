package classTest;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone(10000, "만원폰");
        phone.printSpec();

        BuilderTest bt = new BuilderTest.Builder().intBuild(10).strBuild("asd").build();
        BuilderTest bt2 = new BuilderTest.Builder().intBuild(20).intBuild2(30).strBuild("asd").build();
        bt.printData();
        bt2.printData();

    }
}
