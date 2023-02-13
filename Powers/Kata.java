package Powers;

public class Kata{
    public static long[] powersOfTwo(int n){

        //TODO: Have fun
        long[] arr = new long[n + 1];
        for( int i = 0; i < arr.length; i++){
            arr[i] = (long)Math.pow(2, i);
        }
        return arr;
    }
}
