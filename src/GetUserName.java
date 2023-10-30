import java.util.Scanner;
public class GetUserName {
    public static void main(String[] args) {
        Scanner testScan = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        firstName = SafeInput.getNonZeroLenString(testScan, "Enter your first name");
        System.out.println("First name is " + firstName);
        lastName = SafeInput.getNonZeroLenString(testScan, "Enter your Last name");
        System.out.println("Last name is " + lastName);
        System.out.println("Your name is " + firstName + " " + lastName );
    }
}