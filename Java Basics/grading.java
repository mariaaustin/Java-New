import java.util.Scanner;
public class grading {
    public static void main(String[] args) {
        gs();
        
    }
    static void gs(){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the mark of student : ");
        float mark = in.nextFloat();
        if(mark>=90){
            System.out.println("The grade of the student is S");
        }
        else if(mark>=80 && mark<90){
            System.out.println("The grade of the student is A");
        }
        else if(mark>=70 && mark<60){
            System.out.println("The grade of the student is B");
        }
        else if(mark>=60 && mark<70){
            System.out.println("The grade of the student is C");
        }
        else if(mark>=50 && mark<60){
            System.out.println("The grade of the student is D");
        }
        else if(mark>=40 && mark<50){
            System.out.println("The grade of the student is E");
        }
        else{
            System.out.println("The student has failed");
        } 
    }
    
}
