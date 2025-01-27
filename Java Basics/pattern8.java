public class pattern8 {
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
            for(int space=1; space<=n-total; space++){
                System.out.print(" ");
            }
            for(int col=total; col>=1; col--){
                System.out.print(col);
            }
            for(int col=2; col<=total; col++){
                System.out.print(col);
            }
            System.out.println(" ");
        }
    }
    
}
