package TreeGame4;

public class TreeElements {
    int number;
    boolean open;
    String name = "";

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public void setCardName(){
        if(number>-1) {//leaf or branch
            name += number;
            if (open) name += "○";
            else name += "※";
        }else {//fruit
            name += "●";
            }
    }

    public boolean getOpen(){
        return open;
    }
}
