import java.util.*;

public class exercise {

    public static int printOddNumbers(int n) {
        int sum = 0;
        for(int i=n;i>=1;i--) {
            if(i%2!=0) {
                System.out.println(i);
            }
            sum = sum +i;
            System.out.println(sum);
            return sum;
        }
        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scn.nextInt();

        printOddNumbers(n);
    }

}
