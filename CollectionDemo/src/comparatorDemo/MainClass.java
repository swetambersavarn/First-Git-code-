package comparatorDemo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> student=new ArrayList<Student>();
		
		student.add(new Student("Swetamber", "Chennai", 23, 101));
		student.add(new Student("Swetamber", "Delhi", 23, 104));
		student.add(new Student("Swetamber", "Delhi", 22, 115));
		student.add(new Student("Swetamber", "Delhi", 23, 108));
		student.add(new Student("Swetamber", "Delhi", 25, 103));
		student.add(new Student("Swet", "Chennai", 23, 101));
		student.add(new Student("Abhinav", "Chennai", 28, 110));
		student.add(new Student("George", "Mumbai", 29, 109));
		student.add(new Student("Swetamber", "Chennai", 19, 112));

		
		
		ComparatorClass ic=new ComparatorClass();
				
		
		System.out.println("Unsorted objects are : \n");
		for(Student s:student)
			System.out.println(s);
		
		Collections.sort(student, ic);
		
		System.out.println("\n\nSorted objects are :\n\n");
		for(Student s:student)
			System.out.println(s);
	}
}
