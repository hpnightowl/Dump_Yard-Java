import java.util.Scanner;
public class Verticle {
    public static boolean isStrobogrammatic(String num) {
        int i = 0, j = num.length() - 1;
        while (i <= j) {
            if (!("00 11 88 696".contains(num.charAt(i) + "" + num.charAt(j)))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for ( int i = x ; i < y ; i++){
            // Strobogrammatic Number
            if(isStrobogrammatic(String.valueOf(i))){
                System.out.println(i);
            }
        }
    }
}
