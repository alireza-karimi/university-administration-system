import java.util.ArrayList;

/**
 * The Lab class represents a lab and details about it
 * @author alireza karimi
 * @version 1.0.0
 */
public class Lab {
	//array of lab students
	private ArrayList<Student> students = new ArrayList<Student>();
	//avg of student grades in this lab
	private int avg;
	//day in which the lab take place
	private String day;
	//maximum number of students in this lab
	private int capacity;
	//number of students in this lab
	private int currentSize;
	
	/**
	 * creating a new lab and specifying its capacity and day
	 * @param cap maximum number of students in this lab
	 * @param day day in which the lab take place
	 */
	public Lab(int cap, String day){
		capacity = cap;
		this.day = new String(day);
	}
	
	/**
	 * calculating average of all lab students
	 * @return average of all lab students
	 */
	public void calculateAvg(){
		int sum = 0;
		int count = 0;
		
		for(int i = 0; i < currentSize; i++){
			sum += students.get(i).getGrade();
			count++;
		}
		
		avg = sum/count;
	}
	
	/**
	 * adding a new student to the lab. if the lab is full, it is not possible
	 * @param std Student object
	 */
	public void enrollStudent(Student std) {
		if (currentSize < capacity){
				students.add(std);
				currentSize++;
		} 	
		else{
			System.out.println("Lab is full!!!");
		}
	}
	
	/**
	 * prints students detail in this lab and
	 * avg of student grades in this lab
	 */
	public void print(){
		for(int i = 0; i < currentSize; i++){
			students.get(i).print();
		}
		calculateAvg();
		System.out.println("Average Lab Students Grades: " + avg);
	}
	
	/**
	 * get students of lab
	 * @return array of all lab students
	 */
	public ArrayList<Student> getStudents(){
		return students;
	}
	
	/**
	 * set lab studnets
	 * @param students array of students
	 */
	public void setStudents(ArrayList<Student> students){
		this.students = students;
	}
	
	/**
	 * get average of all lab studnets
	 * @return average of all lab students
	 */
	public int getAvg(){
		calculateAvg();
		return avg;
	}
	
	/**
	 * get the day in which the lab take place
	 * @return day in which the lab take place
	 */
	public String getDay(){
		return day;
	}
	
	/**
	 * set the day in which the lab take place
	 * @param day day in which the lab take place
	 */
	public void setDay(String day){
		this.day = new String(day);
	}
	
	/**
	 * get the maximum number of students in this lab
	 * @return maximum number of students in this lab
	 */
	public int getCapacity(){
		return capacity;
	}
	
	/**
	 * set the maximum number of students in this lab
	 * @param capacity maximum number of students in this lab
	 */
	public void setCapacity(int capacity){
		this.capacity = capacity;
	}

}
