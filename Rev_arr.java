import java.util.*;
class Rev_arr{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.of ele:");
        int num=sc.nextInt();
        int[] n=new int[num];
        System.out.println("enter ele:");
        for(int i=0;i<num;i++){
            n[i]=sc.nextInt();
        }
        for(int i=0;i<num/2;i++){
            int temp=n[i];
            n[i]=n[num-1-i];
            n[num-1-i]=temp;
        }
        System.out.println("reversed array is: ");
        for(int i=0;i<num;i++){
            System.out.print(n[i] + " ");
        }
        System.out.println();
    }
    
}

