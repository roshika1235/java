import java.util.*;
class Reverse_word{
	public static void main(String args[]){
		String s="i am roshika here ";
		String ans="";
		StringBuilder sb=new StringBuilder("");
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch !=' '){
				sb.append(ch);
			}
			else{
				sb.reverse();
				ans+=sb;
				ans+=" ";
				sb.delete(0,sb.length());
			}
		}
		System.out.println(ans);
	}
}