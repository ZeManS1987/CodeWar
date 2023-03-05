package Regist;

public class StringUtils {

    public static String toAlternativeString(String string) {
        // your code here!
        String result = "";
        for(char ch : string.toCharArray()){
            if(Character.isUpperCase(ch)){
                result += Character.toLowerCase(ch);
            }
            else {
                result += Character.toUpperCase(ch);
            }
        }
        return result;