public class pattern5 {
    public static void main(String[] args) {
        int n=5;
        for(int row=1; row<2*n; row++){
            int total;
            if(row>n){
                total=2*n-row;
            }
            else{
                total=row;
            }
            for(int col=1; col<=total; col++ ){
                System.out.print("*");
                
            }
            System.out.println(" ");
        }
    }
    
}
