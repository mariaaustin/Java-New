import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        fact();

    }

    static void fact(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num= in.nextInt();
        int red=1;
        if(num==1 || num ==0){
            System.out.println(num);
        }

        for (int i = 1; i <= num; i++) {
            
            red= red*i;
                        
        }
        System.out.println("The factorial is "+ red); 

    }
    
}
