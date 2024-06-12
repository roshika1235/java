import java.util.*;

class AddArr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int num = sc.nextInt();
        int[] n = new int[num];
        System.out.println("Enter the elements:");
        for (int i = 0; i < num; i++) {
            n[i] = sc.nextInt();
        }
        int sum = 0;
        for (int num1 : n) {
            sum += num1;
        }
        System.out.println("Sum of the array: " + sum);
    }
}
