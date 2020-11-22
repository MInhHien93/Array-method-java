import java.util.Scanner;

public class Value {
    public static void main(String[] args) {
        String [] students = {"Hoàng", "Chiến", "Nghĩa", "Đạt", "Bảo", "Dũng", "Thành", "Thao"};

        String inputName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name:");
        inputName = sc.nextLine();
        boolean isStudent = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.printf("%s has a name of array students and is in the %dth position \n", inputName, i);
                isStudent = true;
                break;
            }
        }
        if (!isStudent) {
            System.out.println("Not found!");
        }
    }
}
