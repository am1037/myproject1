package ImSleepy;

import javax.crypto.Mac;
import java.util.ArrayList;

public class TestSection {
    public static void main(String[] args) {
        ArrayList<Computer> ac = new ArrayList<>();
        Computer c1 = new MacBook();
        MacBook m1 = new MacBook();
        Computer c2 = new WindowsLaptop();
        WindowsLaptop w1 = new WindowsLaptop();

        Computer tempCom1 = new Computer() {
            boolean power;
            @Override
            public String getOS() {
                return "abc";
            }

            @Override
            public void changeOS(String OS) {
                System.out.println("def");
            }

            @Override
            public void powerOnOff() {
                System.out.println("이 컴퓨터는 고장난 것 같다..");
                power = false;
            }
        };

        c1.changeOS("");
        m1.eatApple();
        c2.changeOS("리눅스");
        w1.openWindows();
        ac.add(c1);
        ac.add(m1);
        System.out.println(ac.get(1).getClass());
        tempCom1.powerOnOff();
    }
}
