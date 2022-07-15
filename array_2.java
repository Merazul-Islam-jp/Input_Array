import java.util.Scanner;

public class array_2 {
    static Scanner user_input = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] numbers = new int[3][3];
        System.out.print("Enter a number A:");

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers.length; col++) {
                numbers[row][col] = user_input.nextInt();
            }
        }
        System.out.print("Enter a number B:");

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers.length; col++) {
                numbers[row][col] = user_input.nextInt();
            }
        }
        System.out.println("this is mertix A");

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers.length; col++) {
                System.out.print(numbers[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("this is mertix B");

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers.length; col++) {
                System.out.print(numbers[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

}
