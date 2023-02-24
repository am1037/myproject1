package ImSleepy;

public class MacBook implements Computer{
    String OS = "MacOS";
    Boolean power = false;

    public void eatApple(){
        System.out.println("사과를 먹어요.");
    }

    @Override
    public String getOS() {
        return OS;
    }

    @Override
    public void changeOS(String OS) {
        System.out.println("맥북은 운영체제를 못 바꿔요.");
    }

    @Override
    public void powerOnOff() {
        if(power==true) {power = false; System.out.println("전원을 껐습니다.");}
        else {power = true; System.out.println("전원을 켰습니다.");}
    }
}
