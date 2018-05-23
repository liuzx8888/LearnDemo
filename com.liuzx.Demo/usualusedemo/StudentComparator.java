package usualusedemo;

import java.util.Arrays;
import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		if (arg0.equals(arg1)) {
			return 0;
		}
		if (arg0.getAge()>arg1.getAge()) {
			return -1;
		}
		if (arg0.getAge()<arg1.getAge()) {
			return 1;
		}		
		else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		StudentComparator comparator = new StudentComparator();
		Student student[] = {
				new Student("a1", 5),
				new Student("a2", 5),				
				new Student("a3", 7),
				new Student("a4", 8),				
				new Student("a5", 9)					
		};
		Arrays.sort(student,new StudentComparator());
		for (int i=0;i<student.length;i++) {
			System.out.println(student[i]);
		}
		
	}
	
	

}
