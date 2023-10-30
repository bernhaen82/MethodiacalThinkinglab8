import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner testScan = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        int hour =0;
        int min =0;
        year = SafeInput.getRangeInt(testScan, "Enter your birth year within range 1950 - 2015: ",1950,2015);
        month = SafeInput.getRangeInt(testScan, "Enter your birth month within range 1-12: ",1,12);
        day = SafeInput.getRangeInt(testScan, "Enter your birth day within range 1- 31: ",1,31);
        hour = SafeInput.getRangeInt(testScan, "Enter your birth hour  within range 1- 24: ",1,24);
        min = SafeInput.getRangeInt(testScan, "Enter your birth min  within range 1- 60: ",1,60);


        System.out.println("Your birthday is: " + month + "/" + day + "/" + year + "/" + hour + "/" + min  );

    }
}
