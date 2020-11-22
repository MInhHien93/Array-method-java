import java.util.Scanner;

public class DeleteValue {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 2, 9};
        for (int i : arr) {
            System.out.printf(i  + "\t");
        }

        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a checked number:");
        int inputNum = Integer.parseInt(sc.nextLine());
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == inputNum) {
                index += i;
                for (int j = 0; j < arr.length-1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length-1] = 0;
            }
        }
        System.out.printf("New array after deleting the %dth position element!\n ", index);
                for (int i: arr) {
            System.out.print(i + "\t");
        }
    }

}
