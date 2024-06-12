import java.util.*;
class FindOccurence{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		System.out.println("enter the char");
		char c=sc.next().charAt(0);
		int occ_count=countCharacterOccurence(s,c);
		System.out.println("the char "+ c + " occurs "+ occ_count);
	}
	public static int countCharacterOccurence(String s,char c){
		int count=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==c){
				count++;
			}
		}
		return count;
	}
}