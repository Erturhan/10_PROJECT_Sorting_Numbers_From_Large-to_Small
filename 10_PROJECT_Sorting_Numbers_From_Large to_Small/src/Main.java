import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many numbers would you like to enter: ");
        int talep = scan.nextInt();

        int[] arr1 = new int[talep];

        for (int i = 0; i < talep; i++) {
            System.out.print("Please enter value " + (i + 1) + ": ");
            arr1[i] = scan.nextInt();
        }

        for (int i = 0; i < talep - 1; i++) {
            for (int j = 0; j < talep - 1 - i; j++) {
                if (arr1[j] < arr1[j + 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted values: ");
        for (int i = 0; i < talep; i++) {
            System.out.print(arr1[i] + (i < talep - 1 ? ", " : ""));
        }
    }
}

