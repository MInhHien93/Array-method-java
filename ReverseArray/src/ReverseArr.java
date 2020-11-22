import java.util.Scanner;

public class ReverseArr {
    public static void main(String[] args) {
        System.out.println("The application reverse element of array!");
        System.out.println();
        int size;
        int [] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size:");
            size = Integer.parseInt(sc.nextLine());
            if (size > 20) {
                System.out.println("Size does not exceed 20!");
            }
        } while (size > 20);

        arr = new int[size];

        System.out.println("Add element to array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a element " + (i+1) + ":");
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.printf("%-20s%s", " Element of array:", "" );
        for (int i : arr) {
            System.out.print(i + "\t");
        }

//        Reverse array
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[size - 1 - i];
            arr[size - 1 - i] =temp;
        }

        System.out.println();
        System.out.printf("%-20s%s", "Reverse Array:", "" );
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
}
