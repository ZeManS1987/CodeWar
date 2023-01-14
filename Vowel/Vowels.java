package Vowel;

public class Vowels {

    public static int getCount(String str) {
        int count = 0;
        for(int j = 0; j < str.length(); j++){
            switch(str.charAt(j)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
            }
        }
        return count;
    }
}
