import java.util.Scanner;

public class Calculater {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float a,b;
        char operator;
        System.out.print("Enter the First Number: ");
        a = sc.nextFloat();
        System.out.print("Enter the Operator(+,-,*,/,%): ");
        operator = sc.next().charAt(0);
        System.out.print("Enter the Second number: ");
        b = sc.nextFloat();

        switch(operator) {

            case '+':       
            System.out.println("Addition: "+(a+b));
            break;

            case '-':
            System.out.println("Substraction: "+(a-b));
            break;

            case '*':
            System.out.println("Multiplication: "+(a*b));
            break;

            case '/':
            
            System.out.println("Devision: "+(a/b));
            break;
            
            case '%':
            System.out.println("Modulas: "+(a%b));
            break;

            default:
            System.out.println("Invalid Operator!");


        }
    }

}