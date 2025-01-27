public class NewClass 
{public static void main(String[] args) 
    { 
        int Vali = -1; 
        float Valf = .5f; 
        System.out.println("Initial value of int  : "+Vali); 
        System.out.println("Initial value of int  : "+Valf); 
        int Absi = Math.abs(Vali); 
        float Absf = Math.abs(Valf); 
  
        System.out.println("Absolute value of int : "+Absi); 
        System.out.println("Absolute value of int : "+Absf); 
        System.out.println("");
        double Acosi = Math.acos(60); 
        System.out.println("acos value of Acosi : "+Acosi); 
        double x = Math.PI; 
        x = Math.toRadians(x); 
        double Acosj = Math.acos(x); 
        System.out.println("acos value of Acosj : "+Acosj); 
          
    } 
} 