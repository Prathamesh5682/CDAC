
/* Snippet 3
public class Main2 { 
    public static int main(String[] args){ 
        System.out.println("Hello, World!");         
		return 0; 
    }
}
*/

/* As per your snippet3 you have used int as per place of the void, 
int can be used if we return any value but jvm does not allow to return any of the value as void does not return any value 

1.The error that Main method must return a value of type void in class Main2.
2.The void is used because as it does not return any of the value.
*/


public class Main2 { 
    public static void main(String[] args){ 
        System.out.println("Hello, World!");         
		//return 0; 
    }
}