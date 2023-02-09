package Middle;

class Kata {
    public static String getMiddle(String word) {
        //Code goes here!
        String w = "";
        char[] a = word.toCharArray();
        int q = a.length;
        if(q == 1){
            w = "" + a[0];
        }
        else if(q % 2 == 0){
            w = "" + a[q/2 -1] + a[q/2];
        }
        else if(q % 2 != 0){
            w = "" + a[(q-1)/2];
        }
        return w;
    }
}