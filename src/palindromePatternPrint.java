import java.util.Scanner;

public class palindromePatternPrint {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in) ;
        System.out.println("Input Rows To Print");
            int row = inputNum.nextInt();
//                      1
//                    2 1 2
//                  3 2 1 2 3
//                4 3 2 1 2 3 4
//              5 4 3 2 1 2 3 4 5
        for (int i = 1 ; i <= row ; i++){
// Spaces
                for (int s = 1;  s <= row-i ; s++){
                    System.out.print("  ");
                }
// First Pyramid
                for (int j = i ; j >= 1  ; j--){
                    System.out.print(j+" ");
                }
// Second Pyramid
                for (int l = 2 ; l <= i ; l++ ){
                    System.out.print(l+" ");
                }
                System.out.println();
            }
    }
}
