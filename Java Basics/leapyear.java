import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        ly();
        
    }
    static void ly(){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year=in.nextInt();
        if(year%4==0 || year%100==0 || year%400==0){
            System.out.println("The year is a leap year");
        }
        else{
            System.out.println("The year is not a leap year");
        }

    }
    
}
