package KataTraining;

import java.util.*;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        for(int i = 0; i <lines.size(); i++){
            if(lines.size() > 0){
                lines.set(i, i + 1 + ": " + lines.get(i));
            }
        }
        return lines;
    }
}
