import java.util.Scanner;
public class Studentpass {
    public static void main(String[] args) {
        pf();
        
    }
    static void pf(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the mark : ");
        int mark= in.nextInt();

        if(mark>=35){
            System.out.println("The student has passed");
        }
        else if(mark<35){
            System.out.println("The student has failed");
        }
        else{
            System.out.println("Enter a valid mark");
        }
    }

    
}
