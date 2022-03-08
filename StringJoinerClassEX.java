import java.util.*;

public class StringJoinerClassEX {

	public static void main(String[] args) {
		
		StringJoiner sj1 = new StringJoiner(":","(",")");
		StringJoiner sj2 = new StringJoiner(",","(",")");
		
		sj1.add("Ramya");
		sj1.add("Sri");
		sj1.add("Konujula");
		
		sj2.add("Pradeep");
		sj2.add("Abhilash");
		sj2.add("Nihansh");
		
		System.out.println(sj1);
		System.out.println(sj2);
		
		
		StringJoiner sj3 = sj1.merge(sj2);
		System.out.println(sj3);
		
		
		StringJoiner sj4 = new StringJoiner(";");
		System.out.println(sj4);
		
		sj4.setEmptyValue("Empty-SJ");         //temp-string
		System.out.println(sj4);           
		
		
		sj4.add("Kiran");
		sj4.add("Venkatesh");
		System.out.println(sj4); 
		
		System.out.println(sj4.length());
		
		
		String ss = sj4.toString();
		System.out.println(ss);
		
		//use String-class methods
		
		System.out.println(ss.charAt(0));
		System.out.println(ss.charAt(1));
		System.out.println(ss.charAt(2));

	}

}
