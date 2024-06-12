import java.util.*;
class patternnum{
	public static void main(String args[]){
		String str="12345678910";
		for(int i=0;i<=10;i++){
			for(int j=i+1;j<=11;j++){
				System.out.println(str.substring(i,j));
			}
		}
	}
}