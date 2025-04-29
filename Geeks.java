// import java.util.*;

// public class Geeks {
//     public static int calculateProduct(int a,int b) {
//         return a*b;
//     }
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//          int a = scn.nextInt();
//          System.out.print("Enter second number: ");
//          int b = scn.nextInt();
        
//          System.out.print("Product of two numbers is: "+calculateProduct(a, b));
//     }

    
// }

import java.util.*;

public class Geeks {
    public static void printFactorial(int n) {
        // int factorial = 1;
        for(int i=n;i>=1;i--) {
           int factorial =n*i;
        }
        System.out.println(factorial);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scn.nextInt();

        printFactorial(n);
    }
}
