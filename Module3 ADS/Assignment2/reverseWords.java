public class reverseWords {


    static String reverseWordsWithStrings(String str)
    {
        String [] words = str.split(" ");

        String reversed = "";

        for (int i = words.length - 1 ; i >= 0 ; i--) {
            reversed = reversed + words[i];

            if (i != 0) {
                reversed += " ";
            }
        }
        return reversed;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(reverseWordsWithStrings(str));
    }
}
