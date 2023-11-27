import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        // Problem 1
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(esep(a,b,c));*/
        /*
        // Problem 2
        String a = in.next();
        String b = in.next();
        if (a.length() > b.length()) System.out.println(a);
        else System.out.println(b);*/
        /* Problem 3
        int [] a = new int[6];
        a[0] = in.nextInt();
        int mx = a[0];
        for (int i=1; i<6; i++) {
            a[i] = in.nextInt();
            mx = max(mx, a[i]);
        }
        System.out.println(mx);*/
        /* Problem 4
        int n = in.nextInt();

        if (esep5(n/1000) == esep5(n%1000)) System.out.println("bakytty");
        else System.out.println("bakytsyz");*/
        // problem 7
        String a = in.next();
        String b = in.next();
        String c = in.next();
        boolean A = pal(a);
        boolean B = pal(b);
        boolean C = pal(c);
        if (A == false && B == false && C == false) System.out.println("no palindrome");
        else {
            if (A == true) System.out.println(a + " palindrome");
            if (B == true) System.out.println(b + " palindrome");
            if (C == true) System.out.println(c + " palindrome");
        }
    }
   /* public static int esep5(int x){ // problem 4
        return x/100 + x/10%10 + x%10;
    }*/ // problem 4
   /* public static double esep(int x, int y, int z){ // problem 1
        return (sqrt(x) + x)/2 + (sqrt(y) + y)/2 + (sqrt(z) + z)/2;
    }*/ // problem 1
    public static boolean pal(String s){
        int j=s.length()-1;
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == s.charAt(j--)) continue;
            return false;
        }
        return true;
    }
}