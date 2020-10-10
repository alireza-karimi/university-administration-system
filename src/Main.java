import java.util.ArrayList;

/**
 * Main class
 * @author alireza karimi
 * @version 1.0.0
 */
public class Main {
	
	public static void main(String[] args){
		
		Student std1 = new Student("Ehsan","Edalat", "9031066");
		Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
		Student std3 = new Student("Ahmad", "Asadi", "9031054");
		std3.setGrade(20);
		std1.print();
		std1.setGrade(15);
		std1.print();
		std2.print();
		std2.setGrade(11);
		std2.print();
		std3.print();
		std3.setFirstName("HamidReza");
		std3.print();
		
		Lab lab1 = new Lab(23, "saturday");
		lab1.enrollStudent(std1);
		lab1.enrollStudent(std2);
		lab1.print();
		ArrayList<Student> students;
		students = lab1.getStudents();
		for(Student student : students){
			if(student != null)
				student.print();
		}
		System.out.println(lab1.getAvg());
		
		Lab lab2 = new Lab(20, "tuseday");
		lab2.enrollStudent(std3);
		
		Department department1 = new Department("software", 5, "Dr.Rahimi");
		department1.addLab(lab1);
		department1.addLab(lab2);
		department1.print();
		
		Department department2 = new Department("network", 3, "Dr.Moosavi");
		department2.addLab(lab1);
		department2.addLab(lab2);
		
		College college1 = new College("Computer Engineering", 4);
		college1.addDepartment(department1);
		college1.addDepartment(department2);
		college1.print();

	}
	
}
