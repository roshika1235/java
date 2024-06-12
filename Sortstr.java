import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Sortstr{
	public static void main(String args[]){
		List<String> s=new ArrayList<>();
		s.add("rosh");
		s.add("arya");
		s.add("zoya");
		s.add("kriti");
		s.add("neha");
		Collections.sort(s);
		System.out.println("list:");
		for(String str:s){
			System.out.println(str);
		}
	}
}