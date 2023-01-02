package Walk;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        // Insert brilliant code here
        if(walk.length != 10) return false;
        int w = 0;
        int e = 0;
        int s = 0;
        int n = 0;
        for(int i = 0; i < walk.length; i++){
            if(walk[i] == 'n'){
                n++;
            }
            if(walk[i] == 's'){
                s++;
            }
            if(walk[i] == 'w'){
                w++;
            }
            if(walk[i] == 'e'){
                e++;
            }
        }

        return w == e && n == s ? true : false;
    }
}