import java.util.Scanner;

public class Problem3 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of terms: ");
        int a = sc.nextInt();
      
        if (a % 2 == 0) {
            a = a - 1;
        }
        
        int n = 1;
        
        System.out.println("The odd number series are: ");
        for (int i = 0; i < a; i++) {
            System.out.print(n + " ");
            n = n + 2;
        }
    }
}
