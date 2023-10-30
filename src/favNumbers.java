import java.util.Scanner;

public class favNumbers {
    public static Scanner testScan = new Scanner(System.in);
    public static void main(String[] args) {
        int favInt = 0;
        double favDouble = 0;
        favInt = SafeInput.getInt(testScan,"what is your favorite integer: ");
        System.out.println("Your favorite integer is: " + favInt);
        favDouble = SafeInput.getDouble(testScan, "what is your favorite double");
        System.out.println("Your favorite double is: " + favDouble);
    }
}
