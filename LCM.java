import java.util.Scanner;

public class LCM {

    public static int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        int gcd = gcd(a,b);
        int lcm = (a*b)/gcd;
        System.out.println("LCM Of Two Given numbers: "+lcm);
    }
    
}
