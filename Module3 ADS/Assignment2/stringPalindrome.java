public class stringPalindrome {

    static int stringreverse(String str, int index){
        if(index < 0){
            return 0;
        }
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        if (reversed.equals(str)) {
            System.out.println("It is palindrome");
        }
        return 1;
    }
    public static void main(String[] args) {
        String str = "madam";
        stringreverse(str,str.length() - 1);

    }
}
