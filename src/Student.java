/**
* The Student class represents a student in a student
* administration system.
* It holds the student details relevant in our context.
* @author alireza karimi
* @version 1.0.0
*/
public class Student {
	
	//student first name
	private String firstName;
	
	//student last name
	private String lastName;
	
	//student id with exactly 7 chars
	private String id;
	
	//student grade
	private int grade;
	
	/**
	 * Create a new student with a given name and ID number
	 * student grade will be zero for default
	 * @param fName student first name
	 * @param lname student last name
	 * @param sID student id with exactly 7 chars
	 */
	public Student(String fName, String lname, String sID){
		
		if(sID.length() == 7){
			id = sID;
		}
		else{
			System.out.println("INVALID STUDENT ID");
			return;
		}
		firstName = fName;
		lastName = lname;
		grade = 0;
	
	}
	
	/**
	* get the first name of student
	* @return firstName field
	*/
	public String getFirstName() {
		return firstName;
	}
	
	/**
	* set first name of a student
	* @param fName firstName field 
	*/
	public void setFirstName(String fName) {
		firstName = fName;
	}
	
	/**
	 * get student last name
	 * @return student last name
	 */
	public String getLastName(){
		return lastName;
	}
	
	/**
	 * set student last name
	 * @param lName lastName field
	 */
	public void setLastName(String lName){
		lastName = lName;
	}
	
	/**
	 * get student id
	 * @return student id
	 */
	public String getId(){
		return id;
	}
	
	/**
	 * set student id with exactly 7 chars
	 * @param sID id feild
	 */
	public void setId(String sID){
		if(sID.length() == 7){
			id = sID;
		}
		else{
			System.out.println("INVALID STUDENT ID");
			return;
		}
	}
	
	/**
	 * get student grade
	 * @return student grade
	 */
	public int getGrade(){
		return grade;
	}
	
	/**
	 * set student grade
	 * @param sGrade grade field
	 */
	public void setGrade(int sGrade){
		grade = sGrade;
	}
	
	/**
	* Print the student’s last name and ID number to the
	output terminal.
	*/
	public void print() {
		System.out.println(lastName + ", student ID: "+ id + ", grade: " + grade);
	}
	
}
