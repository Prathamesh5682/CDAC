class NonRepeatedCharacters {

    static void findNonRepeats(String str, int index) {
        
        if (index >= str.length()) {
            return;
        }

        char currentChar = str.charAt(index);
        boolean isRepeated = false;


        for (int i = 0; i < str.length(); i++) {
            if (i != index && str.charAt(i) == currentChar) {
                isRepeated = true;
                break;
            }
        }


        if (!isRepeated) {
            System.out.print(currentChar + " ");
        }


        findNonRepeats(str, index + 1);
    }

    public static void main(String[] args) {
        String str = "programming";
        System.out.println("Non-repeated characters are: ");
        findNonRepeats(str, 0);
    }
}
