public class pattern6 {
    public static void main(String[] args) {
        int n=5;
        for(int row=1; row<2*n; row++){
            int total;
            // int totals;
            if(row>n){
                total=2*n-row;
                // totals=row;
            }
            else{
                total=row;
                // totals=2*n-row;
            }
            for(int space=1; space<=n-total; space++){
                System.out.print(" ");
            }
            for(int col=1; col<=total; col++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    
}
