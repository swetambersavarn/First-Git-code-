package comparatorDemo;

import java.util.Comparator;

public class ComparatorClass implements Comparator<Student>{




	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		//	int ageDiff=o1.getAge()-o2.getAge();
		int sortByName=o1.getName().compareTo(o2.getName());
		if(sortByName==0)
		{
			int sortByAge=o1.getAge()-o2.getAge();
			if(sortByAge==0)
			{
				int sortByRoll=o1.getRoll()-o2.getRoll();
				return sortByRoll;
			}
			else
				return sortByAge;
		}
		else
			return sortByName;
	}

}
