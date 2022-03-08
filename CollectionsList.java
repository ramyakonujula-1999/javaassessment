import java.util.*;

class Student{
	int rollno;
	String name, address;
	
	Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		
	}
}
public class CollectionsList {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		
		Student s1 = new Student(1, "Abhi", "Hyderabad");
		Student s2 = new Student(2, "Ram", "Rajahmundry");
		Student s3 = new Student(3, "Deepu", "Chennai");
		Student s4 = new Student(4, "Ganesh", "Kakinada");
		
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		
		for(Student s: list) {
			System.out.println(s.rollno+" "+s.name+" "+s.address);
		}
		
		//hashset
		HashSet<String> hs = new HashSet<>();
		 hs.add("raviteja");
		 hs.add("mahesh");
		 hs.add("gopi");
		 hs.add("tarak");
		 
		 Iterator<String> it = hs.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		
	}
}

