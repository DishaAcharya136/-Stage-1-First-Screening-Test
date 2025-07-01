import java.util.Scanner;

public class Problem4 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of values: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the values: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int count = 0;
        
        for(int i = 1; i <= 9; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[j] % i == 0) {
                    count++;
                }
            }
            System.out.print(i + ":" + count + ", ");
            count = 0; 
        }
    } 
}
