public class UninitializedWhileLoop { 
 public static void main(String[] args) { 
 int count=0; 
 while (count < 10) { 
 System.out.println(count); 
 count++; 
 } 
 } 
}

/*
1.Compilation error count variable has not been initialized.
2.Initialized the value of count variable.
*/