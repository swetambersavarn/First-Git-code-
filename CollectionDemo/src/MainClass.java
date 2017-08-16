import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> student=new ArrayList<Student>();
		
		student.add(new Student("Swetamber", "Chennai", 24, 101));
		student.add(new Student("Swetamber", "Delhi", 23, 104));
		student.add(new Student("Swetamber", "Delhi", 25, 103));
		student.add(new Student("Swet", "Chennai", 22, 101));
		student.add(new Student("Abhinav", "Chennai", 28, 110));
		student.add(new Student("George", "Mumbai", 29, 109));

		
		System.out.println("Unsorted objects are : \n");
		for(Student s:student)
			System.out.println(s);
		Collections.sort(student);
		System.out.println("\n\nSorted objects are :\n\n");
		for(Student s:student)
			System.out.println(s);
		
	}
}
