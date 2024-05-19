public class Pattern {
    public static void main(String args[]){

        //////// Pattern 1
        // int n=5;
        // int m=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //         if(i==1 || j==1 || i==n || j==m){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.print("\n");
        // }
            /////// Pattern 2 
        // for(int i = 4; i>=1;i--){
        //     for(int j = 1; j <=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        ////// Palindromic pattern
            int n =5;
        for(int i=1; i<=n; i++){
            for(int j=1;j<=n-i;j++){
           System.out.print(" "+ " ");
            }
            //first half
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
          
        //2nd half
        for(int j=2;j<=i;j++){
            System.out.print(j + " ");
        }
        System.out.println();
    }
    }
}
