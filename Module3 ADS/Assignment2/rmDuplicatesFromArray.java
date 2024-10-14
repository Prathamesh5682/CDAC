

public class rmDuplicatesFromArray {

    public static int remove(int arr[]){

        //when arrays length is empty then it will directly return 0
        if(arr.length ==0){
            return 0;
        }

        int unique = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[unique]) {
                unique++;
                arr[unique] = arr[i];
            }
        }
        return unique + 1;
    }


    public static void main(String[] args) {
        int arr[] = {0,0,1,1,2,3,4,5};

        System.out.println("Size before removing duplicates : "+ arr.length);

        int newLength = remove(arr);

        System.out.println("Size after removing duplicates : "+ newLength);
    }
}
