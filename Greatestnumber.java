
import java.util.Scanner;

public class Greatestnumber{
    public static void main(String args[]){
        int a, b ,c;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter a value of A:");
        a = S.nextInt();
           System.out.println("Enter a value of B:");
        b = S.nextInt();
           System.out.println("Enter a value of C:");
        c = S.nextInt();
        
        if(a > b  && a  > c){
            System.out.println("A is Greatest");
        } 
        else if(b > c){
                     System.out.println("B is Greatest");
        }
        else{
                     System.out.println("c is Greatest");
        }
    }
}