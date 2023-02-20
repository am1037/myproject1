package ClassTest;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account("홍길동", "율도국", 10000);
        acc.withdraw(1000);
        acc.withdraw(2000);
        acc.withdraw(3000);
        acc.withdraw(4000);
        acc.withdraw(5000);
        acc.deposit(100000);
        acc.showStatement();
        Account acc2 = new Account("성춘향", "남원", 5000);
        Account acc3 = new Account("배트맨", "고담", 2100000000);
        acc3.withdraw(100);
        acc3.showStatement();
        System.out.println(Account.account);
        acc.showStatement();

        Computer com = new Computer.Builder().buildGC("asd").build();
        com.printSpec();

        Subject sub1 = new Subject("과목1", "13:00", "수강생1");
        Subject sub2 = new Subject("과목2", "14:00", "수강생2");
        System.out.println(sub1.toString());
        System.out.println(sub2.toString());
    }
}
