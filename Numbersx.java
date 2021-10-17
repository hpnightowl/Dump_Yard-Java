import java.util.Scanner;

public class Numbersx {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for ( int i = x; i <= y; i++){
            if(isCoPrime(i, x)){ 
                if(y % i == 0){
                    System.out.println(i);
                }
            }
        }
    }  
 
    public static boolean isCoPrime(int a, int b){
        int gcd = 1; 
        int emin = min(a, b);
        int emax = max(a, b);
        while (emax > emin) 
        {
            int r = emax % emin; 
            if (r == 0)
            {
                gcd = emin;
                break;
            }
            else
            {
                emax = emin;
                emin = r;
            }
        }
        return gcd == 1? true : false;
    }

    private static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    private static int min(int a, int b) {
        return (a < b) ? a : b;
    }
 }