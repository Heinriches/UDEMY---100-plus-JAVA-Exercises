import java.util.Scanner;

public class Exercise_003 
{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int number;
        
        System.out.println("Type a number.");
        number = sc.nextInt();
        
        checkEvenOdd(number);
        
    }
    
    
    
    
    public static void checkEvenOdd(int number) 
    {
        if (number % 2 == 0){
            System.out.println("This is an Even number.");
        } else{
            System.out.println("This is an Odd number.");
        }
    }
    
    
}
