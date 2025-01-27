import java.util.Scanner;
public class multiplicationtable {
    public static void main(String[] args) {
        multiply();
    }
    static void multiply(){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the number :");
        int num= in.nextInt();
        for(int i=1; i<=10; i++){
            int red= num*i;
            System.out.println(num + "*" + i + "=" + red);
        }

        }
}


