import java.util.Scanner;

public class Exercise_002 {
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int sum;
        
        System.out.println("Digite o primeiro numero");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo numero");
        num2 = sc.nextInt();
        
        sum = addNumbers(num1, num2);
        
        System.out.println(sum);
    }
    
    
    public static int addNumbers(int num1, int num2) {
        int sum = (num1 + num2);
        return sum;
    }
}
