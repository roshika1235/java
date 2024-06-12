import java.util.Scanner;
class VowelorConsonant{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character");
		char ch=sc.next().charAt(0);
		ch=Character.toLowerCase(ch);
		if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')){
			System.out.println("It is a Vowel");
		}
		else if((ch>='a'&&ch<='z')){
			System.out.println("It is a Consonant");
		}
		else{
			System.out.println("Invalid character");
		}
	}
}