import java.util.Scanner;

class Calculator {
    public void add(double a, double b) {
        double c = a + b;
        System.out.println(a + " + " + b + " is " + c);
    }

    public void sub(double a, double b) {
        double c = a - b;
        System.out.println(a + " - " + b + " is " + c);
    }

    public void mul(double a, double b) {
        double c = a * b;
        System.out.println(a + " x " + b + " is " + c);
    }

    public void div(double a, double b) {
        if(b != 0){
            double c = a / b;
            System.out.println(a + " / " + b + " is " + c);
        } 
        else {
            System.out.println("Cannot divide by zero.");
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Enter the type of operation (Addition, Substraction, Multiplication, Division):");
        String op = sc.next();

        switch(op) {
            case "Addition":
                cal.add(num1, num2);
                break;
            case "Substraction":
                cal.sub(num1, num2);
                break;
            case "Multiplication":
                cal.mul(num1, num2);
                break;
            case "Division":
                cal.div(num1, num2);
                break;
            default:
                System.out.println("Invalid Operation");
        }
    }
}
