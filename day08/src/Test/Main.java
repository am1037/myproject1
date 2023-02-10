package Test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        byte[] buffer = new byte[8192];
        int a = System.in.read(buffer, 1, 1);
        System.out.println(""+(buffer[0]-48)+(buffer[1]-48)+(buffer[2]-48));
    }
}
