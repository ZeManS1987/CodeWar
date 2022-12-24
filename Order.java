
public class Order {
    public static void main(String[] args) {
    String words = "4of Fo1r pe6ople g3ood th5e the2";


        // Ваша задача состоит в том, чтобы отсортировать заданную строку. Каждое слово в строке будет содержать одно число. Это число является позицией, которую слово должно иметь в результате.
        //
        //Примечание: Числа могут быть от 1 до 9. Таким образом, 1 будет первым словом (а не 0)....

            int index = 0;
            String[] res = words.split(" ");
            String[] result = new String[res.length];
            for(String r : res){
                index = Integer.parseInt(r.replaceAll("\\D", ""));
                    result[index - 1] = r;
                }



            String s = "";
        for(int i = 0; i < result.length; i++){
                    if(i < (result.length - 1)){
                        s += result[i] + " ";
                    }
                    else s += result[i];
                }

        System.out.println(s);
    }
}
