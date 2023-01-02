package SentenceSmash;
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.Test;

public class SmashWords {

    public static String smash(String... words) {
        // TODO Write your code below this comment please
        String text = "";
        for(String word : words){
            text += word + " ";
        }
        return text.trim();
    }
}


public class SmashWordsTest {

    @Test
    public void validate() {
        assertEquals("Bilal Djaghout", SmashWords.smash(new String[] { "Bilal", "Djaghout" }));
    }

    @Test
    public void validateEmpty() {
        assertEquals("", SmashWords.smash(new String[] {}));
    }


    @Test
    public void validateOneWord() {
        assertEquals("Bilal", SmashWords.smash(new String[] {"Bilal"}));
    }

}
