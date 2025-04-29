import java.util.Scanner;

public class Calculater {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        float a,b;
        char operator;
        System.out.print("Enter the First Number: ");
        a = scn.nextFloat();
        System.out.print("Enter the Operator(+,-,*,/,%): ");
        operator = scn.next().charAt(0);
        System.out.print("Enter the Second number: ");
        b = scn.nextFloat();

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