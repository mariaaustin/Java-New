import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=in.nextInt();
        oe(num);
        
    }

    static void oe(int num){
        if(num==1 || num==0){
            System.out.println("The number given is neither odd or even");
        }
        else if(num%2==0){
            System.out.println("The number is even");

        }
        else{
            System.out.println("The number is odd");
        }

    }
    
}
