package Arrays;

import java.util.Scanner;

public class CheckArrayEquality {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int size1 = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int size2 = sc.nextInt();

        if (size1 != size2) {
            System.out.println("Arrays are not equal.");
            sc.close();
            return;
        }

        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        int i;
        for (i = 0; i < size1; i++) {
            if (arr1[i] != arr2[i]) {
                break;
            }
        }

        if (i == size1) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }

        sc.close();
    }
}