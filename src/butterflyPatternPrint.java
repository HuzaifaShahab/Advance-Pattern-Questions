import java.util.Scanner;

public class butterflyPatternPrint {
    public static void main(String[] args) {

        Scanner inputNum = new Scanner(System.in);
        System.out.println("Input number of rows");
            int row = inputNum.nextInt();

//              *                 *3
//              * *             * *
//              * * *         * * *
//              * * * *     * * * *
//              * * * * * * * * * *
//              * * * * * * * * * *
//              * * * *     * * * *
//              * * *         * * *
//              * *             * *
//              *                 *


        for (int i = 1 ; i <= row ; i++){
//                First Part
                    for(int j = 1 ; j <= i ; j++){
                        System.out.print("*"+" ");
                    }
                    int space = 2*(row-i) ;
//    Spaces
                    for (int k = 1 ; k <= space ; k++){
                        System.out.print("  ");
                    }
                    //                Second Part
                        for (int l = 1 ; l <= i ; l++){
                            System.out.print("*"+" ");
                        }
                        System.out.println();
                }

    //            Lower Half -> first Part
            for (int i = row ; i>=1 ; i--){
    //                First Part
                    for(int j = 1 ; j <= i ; j++){
                        System.out.print("*"+" ");
                    }
                    int space = 2*(row-i) ;

                    for (int k = 1 ; k <= space ; k++){
                        System.out.print("  ");
                }
                    //                Second Part
                    for (int l = 1 ; l <= i ; l++){
                        System.out.print("*"+" ");
                    }
                    System.out.println();
            }

            }
    }
