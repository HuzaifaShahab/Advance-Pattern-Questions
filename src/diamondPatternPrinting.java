import java.util.Scanner;

public class diamondPatternPrinting {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        System.out.println("Input Rows To Print");
            int row = inputNum.nextInt();

//                   *
//                 * * *
//               * * * * *
//             * * * * * * *
//           * * * * * * * * *
//           * * * * * * * * *
//             * * * * * * *
//               * * * * *
//                 * * *
//                   *
//             First Part
        for (int i = 1 ; i <= row ; i++){
// For Spaces
                for (int s = 1 ; s <= row-i ; s++){
                    System.out.print("  ");
                }
    // For Upper Pyramid
                for (int j = 1 ; j <= (2 * i - 1) ; j++){
                    System.out.print("*"+" ");
                }
                     System.out.println();
        }

//            Second Part
        for (int i = row ; i >= 1 ; i--){
// For Spaces
                for (int s = 1 ; s <= row-i ; s++){
                    System.out.print("  ");
                }
    // For Lower Pyramid
                for (int j = 1 ; j <= (2 * i - 1) ; j++){
                    System.out.print("*"+" ");
                }
                        System.out.println();
        }
    }
}
