import java.util.Scanner;
public class voter{
    public static void main(String[] args) {
        
        ve();
    }
    static void ve(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the age of the Voter");
        int age = in.nextInt();
        if(age<18){
            System.out.println("Not eligible to vote");
        }
        else{
            System.out.println("The voter is eligible");
        }

    }
}