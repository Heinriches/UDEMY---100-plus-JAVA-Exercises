import java.util.Scanner;

public class Exercise_004 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        System.out.println("Digite um número: ");
        n = sc.nextInt();
        
        printNumbers(n);
    }
    public static void printNumbers(int fim) {
        for(int inicio = 1; inicio <= fim; inicio++){
            System.out.println(inicio);
        }
    }
}
