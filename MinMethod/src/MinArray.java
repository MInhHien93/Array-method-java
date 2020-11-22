public class MinArray {
    public static int minValue (int [] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int [] arr = {3,6,5,9,8,7,1,45};
        int min = minValue(arr);
        System.out.println(min);
    }
}
