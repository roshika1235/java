import java.util.*;
class Builder{
	public static void main(String args[]){
		StringBuilder str= new StringBuilder("Hello");
		str.setCharAt(0,'m');
		System.out.print(str);
		str.append("world");
		System.out.println(str);
		System.out.println(str.reverse());
	}
}