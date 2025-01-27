import java.util.Scanner;
public class vowel{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character :");
        char character=in.next().trim().charAt(0);
        character=Character.toLowerCase(character);
        if(character=='a' || character=='e' || character=='i' || character=='o' || character=='u'){
            System.out.println("The entered character is a vowel");
        }
        else{
            System.out.println("The entered character is not a vowel");
        }


    }
}
