import java.util.Scanner;

public class parallelogramPatternPrint {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        System.out.println("Input Number Of Rows");
            int row = inputNum.nextInt();

        //          * * * * *
        //        * * * * *
        //      * * * * *
        //    * * * * *
        //  * * * * *

        for (int i = 1 ; i <= row ; i++){
// Space Printing
                int space = (row - i) ;
                for (int k = 1 ; k <= space ; k++){
                    System.out.print(" ");
                }
                for (int j = 1 ; j <= row ; j++){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
    }
}
