package SumDigPower;
import java.util.List;
import java.util.ArrayList;

public class SumDigPower {
    public static void main(String[] args) {
                    long a = 1;
                    long b = 100;

                // your code
                List<Long> result = new ArrayList<Long>();
                for(long i = a; i <= b; i ++){
                    char[] q = String.valueOf(i).toCharArray();
                    long sum = 0;
                    for(int j = 0; j < q.length; j++){
                        long w = (long)Math.pow((q[j] - 48), j + 1);
                        sum += w;
                    }
                    if(i == sum){
                        result.add(i);
                    }
                }
            System.out.println(result);
            }
        }

