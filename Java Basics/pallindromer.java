public class pallindromer {
    public static void main(String[] args) {
        boolean pallindrome =recursion(0, 4 , "madam");
        System.out.println(pallindrome);
    }
    
    static boolean recursion(int i , int j , String str){
        if(i>=j){
            return true;
        }
        if(str.charAt(i) != str.charAt(j)){
            return false;
        }

        return recursion(i + 1, j - 1, str);

    }
}
