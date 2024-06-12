import java.util.Scanner;
class Duplicate{
	public static void main(String args[]){
		String s="programming";
		int c=0;
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++){
			for(int j=i+1;j<ch.length;j++){
				if(ch[i]==ch[j]){
					System.out.println("dup char are:"+ch[j]);
					c++;
				}
			}
		}
			System.out.println("its count:"+c);
	}
}