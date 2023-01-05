package Same;

import java.util.Arrays;

public class AreSame {
    public static void main(String[] args) {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361, 361};
        if(a == null || b == null){
            System.out.println(false);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int count = 0;
        for(int z : a){
            for(int x : b){
                if(z == (int) Math.sqrt(x)){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count == b.length ? true : false);
    }
}
