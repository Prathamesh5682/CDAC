public class reverseNumber {

    static void reverse(int num){
        //number to string conversion
        String strNum = String.valueOf(num);

        String reversed="";
        for (int i = strNum.length() - 1; i >= 0; i--) {
            reversed += strNum.charAt(i);
        }
        System.out.println(reversed+"");


    }
    public static void main(String[] args) {
        int num = 12345;

        reverse(num);
    }
}
