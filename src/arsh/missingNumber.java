package arsh;

import java.util.Arrays;
import java.util.Collections;

public class missingNumber {

    public static void main(String[] args) {
        int[] ab= {1,3,0};

        ab= Arrays.stream(ab).sorted().toArray();
        for(int i:ab)
        System.out.println(i);
    }
}
