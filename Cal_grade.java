import java.util.Scanner;

class Cal_grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks:");
        int n=sc.nextInt();
        if (n<0 || n>100) {
            System.out.println("Invalid marks entered");
        } else {
            if (n <= 13) {
                System.out.println("F");
            } else if (n>13 && n<=30) {
                System.out.println("E");
            } else if (n>30 && n<= 45) {
                System.out.println("D");
            } else if (n>45 && n<= 55) {
                System.out.println("C");
            } else if (n>55 && n<= 65) {
                System.out.println("B");
            } else if (n>65 && n<= 75) {
                System.out.println("A2");
            } else if (n>75 && n<= 85) {
                System.out.println("A1");
            } else {
                System.out.println("O");
            }
        }
    }
}
