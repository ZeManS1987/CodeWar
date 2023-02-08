package DisemvowelTrolls;

public class Troll {
    public static String disemvowel(String str) {
        // Code away...
        String[] st = {"a", "A", "e", "E", "i", "I", "o", "O", "u", "U"};
        for(int i = 0; i < st.length; i++){
            str = str.replace(st[i], "");
        }
        return str;
    }
}