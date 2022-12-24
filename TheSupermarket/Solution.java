package TheSupermarket;
//There is a queue for the self-checkout tills at the supermarket. Your task is write a function to calculate the total time required for all the customers to check out!
//
//input
//customers: an array of positive integers representing the queue. Each integer represents a customer, and its value is the amount of time they require to check out.
//n: a positive integer, the number of checkout tills.
//output
//The function should return an integer, the total time required.

    import java.util.Arrays;
    public class Solution {
        public static void main(String[] args) {
            int n = 3;
            int[] customers = new int[] { 2, 2, 3, 3, 4, 4 };
            int[] result = new int[n];
            for(int i = 0; i < customers.length; i++){
                result[0] += customers[i];
                Arrays.sort(result);
            }
            System.out.println(result[n-1]);
        }

    }

