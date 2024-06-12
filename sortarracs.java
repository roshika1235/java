import java.util.*;
class sortarracs{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.of ele:");
        int num=sc.nextInt();
        int[] n=new int[num];
        System.out.println("enter ele:");
        for(int i=0;i<num;i++){
            n[i]=sc.nextInt();
        }
	Arrays.sort(n);
	System.out.println("sorted array in asc");
	for(int i=0;i<num;i++){
            System.out.print(n[i] + " ");
        }
	System.out.println();
   }
}