package ListQueueSetMap;

import java.util.HashSet;
import java.util.Random;

public class HashSetExample {
    public static void main(String[] args) {
        int N = 14;
        long beforeTime = System.currentTimeMillis();
        HashSet hs = new HashSet();
        int seed = 0;
        Random r = new Random(seed);
        int count = 0;

        while (hs.size()!=N) {
            hs.clear();
            r.setSeed(seed++);
            for (int i = 0; i < N; i++) {
                hs.add(r.nextInt(N));
            }
        }
        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime)/1000;
        System.out.println(hs+", "+count+", "+(seed-1)+", "+secDiffTime+"초");
    }
}
