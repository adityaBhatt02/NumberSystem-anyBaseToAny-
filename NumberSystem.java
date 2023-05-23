import java.util.*;

class NumberSystem4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scn.nextInt();
        System.out.println("Enter the base of the number:");
        int b = scn.nextInt();
        System.out.println("Enter the base you want to change the number to:");
        int c = scn.nextInt();

        int dn = changeBase(n,b,c);
        System.out.println("Number after changing the base from " + b + " to " + c + " is: \n" + dn);
    }

    public static int changeBase(int n , int b , int c){
        int ctd = changeToDecimal(n,b);
        int cfd = changeFromDecimal(ctd,c);
        return cfd;
    }

    public static int changeToDecimal(int n , int b){
        int rs = 0;
        int p = 1;
        while(n > 0){
            int dig = n%10;
            n = n/10;
            rs += dig * p;
            p = p * b;
        }
        return rs;
    }

    public static int changeFromDecimal(int n , int b){
        int rs = 0;
        int p = 1;
        while(n > 0){
            int dig = n%b;
            n = n/b;
            rs += dig * p;
            p = p * 10;
        }
        return rs;
    }
}
