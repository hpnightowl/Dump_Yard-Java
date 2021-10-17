import java.util.Scanner;

public class LeapYear {
    public static boolean isLeapYear(int a) {
        if( a % 4 == 0 && a%100 !=0 || a %400 ==0) {
            return true;
        }
        else 
            return false;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year For checking Leap Year: ");
        int year = sc.nextInt();
        if( year > 999 && year < 10000) {
            if(isLeapYear(year)){
                System.out.println("It is a leap Year");
            } else {
                System.out.println("it is not a leap year");
            }
        } else 
            System.out.println("Enter a valid year");
    }
}
