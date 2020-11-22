import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        System.out.println("Find the largest value of the array!");
        Scanner sc = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.println("Enter a size:");
            size = Integer.parseInt(sc.nextLine());
            if (size > 20) {
                System.out.println("Size does not exceed 20!");
            }
        } while (size > 20);

        arr = new int[size];
        System.out.println("Add element to array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("The element at position %d is: ", i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.printf("%-20s%s","Element of the array: ", "");
        for (int i : arr) {
            System.out.print(i + "\t");
        }

        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index += i;
            }
        }
        System.out.println();
        System.out.printf("The largest value of the array is %d and at position %d", max, index);
    }

}