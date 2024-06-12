import java.util.*;
class CountVandC{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string");
		String s=sc.nextLine();
		s=s.toLowerCase();
		int c=0;
		int v=0;
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				v++;
			}	
			else if(ch>='a' && ch<='z'){
				c++;
			}
			else{
				System.out.println("invalid");
			}
		}
		System.out.println("vowel_count: "+v);
		System.out.println("consonant_count: "+c); 		
	}
}