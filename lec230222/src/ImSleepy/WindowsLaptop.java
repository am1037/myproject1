package ImSleepy;

public class WindowsLaptop implements Computer{
    String OS = "Windows";
    boolean power = false;

    public void openWindows(){
        System.out.println("환기를 해요.");
    }

    @Override
    public String getOS() {
        return OS;
    }

    @Override
    public void changeOS(String OS) {
        System.out.println("운영체제를 "+OS+"로 바꿨습니다.");
    }

    @Override
    public void powerOnOff() {
        if(power==true) {power = false; System.out.println("전원을 껐습니다.");}
        else {power = true; System.out.println("전원을 켰습니다.");}
    }
}
