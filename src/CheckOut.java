import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner testScan = new Scanner(System.in);
        boolean loop = true;
        double next = 0;
        double sum = 0;
        do{
            next = SafeInput.getRangeDouble(testScan,"Enter item price ", .50,10);
            sum = sum + next;
            loop = SafeInput.getYNConfirm(testScan, "Do you have any more items?");
        }
        while(loop);
        System.out.println("Your total is " + sum);
    }

}
