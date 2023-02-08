package Function;

class ArithmeticFunction {
    public static int arithmetic(int a, int b, String operator) {
        // your code here
        int value = 0;
        switch(operator){
            case "add": value =  a + b;
                break;
            case "subtract": value = a - b;
                break;
            case "multiply": value =  a * b;
                break;
            case "divide": value =  a/b;
                break;

        }
        return value;

    }
}