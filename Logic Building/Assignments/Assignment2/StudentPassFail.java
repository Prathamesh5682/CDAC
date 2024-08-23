import java.util.Scanner;

public class StudentPassFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input grades for three subjects
        System.out.println("Enter the grade for Subject 1:");
        int subject1 = scanner.nextInt();

        System.out.println("Enter the grade for Subject 2:");
        int subject2 = scanner.nextInt();

        System.out.println("Enter the grade for Subject 3:");
        int subject3 = scanner.nextInt();

        int failCount = 0;

        // First subject check
        switch (subject1 > 40 ? 1 : 0) {
            case 0:
                failCount++;
                break;
            case 1:
                // Second subject check
                switch (subject2 > 40 ? 1 : 0) {
                    case 0:
                        failCount++;
                        break;
                    case 1:
                        // Third subject check
                        switch (subject3 > 40 ? 1 : 0) {
                            case 0:
                                failCount++;
                                break;
                        }
                        break;
                }
                break;
        }

        // Determine pass/fail outcome
        switch (failCount) {
            case 0:
                System.out.println("The student passes in all subjects.");
                break;
            default:
                System.out.println("The student fails in " + failCount + " subject(s).");
                break;
        }

        scanner.close();
    }
}
