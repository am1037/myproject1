package ClassTest;

public class Computer {
    String cpu;
    String board;
    String gc;
    int hdd;
    int ram;

    private Computer(String cpu, String board, String gc, int hdd, int ram){
        this.cpu=cpu;
        this.board=board;
        this.gc=gc;
        this.hdd=hdd;
        this.ram=ram;
    }

    public void printSpec(){
        System.out.println("cpu는 "+cpu+"입니다.");
        System.out.println("board는 "+board+"입니다.");
        System.out.println("gc는 "+gc+"입니다.");
        System.out.println("hdd 용량은 "+hdd+"입니다.");
        System.out.println("ram 용량은 "+ram+"입니다.");
    }

    public static class Builder{
        String cpu="";
        String board="";
        String gc="";
        int hdd=0;
        int ram=0;

        public Builder(){

        }

        public Builder buildCPU(String cpu){
            this.cpu = cpu;
            return this;
        }
        public Builder buildGC(String gc){
            this.gc = gc;
            return this;
        }
        public Builder buildBoard(String board){
            this.board = board;
            return this;
        }
        public Builder buildRAM(int ram){
            this.ram = ram;
            return this;
        }
        public Builder buildHDD(int hdd){
            this.hdd = hdd;
            return this;
        }
        public Computer build(){
            return new Computer(cpu, board, gc, hdd, ram);
        }
    }
}
