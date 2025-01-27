import java.util.Scanner;
public class eb {
    public static void main(String[] args) {
        bill();
    }
    static void bill(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the current unit : ");
        float unit=in.nextFloat();
        if(unit<=100){
            System.out.println("The amount is 0");
        }
        else if(unit<=200 && unit>100){
            double amt = (unit - 100) * 1.5 + 20;
            System.out.println("The amount is " + amt);

        }
        else if(unit<=500 && unit>200){
            double amt=100 * 1.5 + (unit - 200) * 2+30;
            System.out.println("The amount is " + amt);

        }
        else if(unit>500){
            double amt=100*3.5+300*4.6+(unit-500)*6.6+50;
            System.out.println("The ammount is " + amt);
        }
    }
    
}
