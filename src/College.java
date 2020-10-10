/**
 * The College class represents a college in a university and details about it
 * @author alireza karimi
 * @version 1.0.0
 */
public class College {
	//college name
	private String name;
	//array of departments in this college
	private Department[] departments;
	//number of maximum departments in this college
	private int maxDepartments;
	//number of current departments in this college
	private int currentDepartments;
	//average of all students in this department
	private int avg;
	
	public College(String name, int maxDepartments){
		this.name = name;
		this.maxDepartments = maxDepartments;
		departments = new Department[maxDepartments];
	}
	
	/**
	 * get the name of college
	 * @return name of college
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * set the name of college
	 * @param name name of college
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * get the maximum number of departments in this college
	 * @return maximum number of departments in this college
	 */
	public int getMaxDepartments(){
		return maxDepartments;
	}
	
	
	/**
	 * get current number of departments in this college
	 * @return current number of departments in this college
	 */
	public int getCurrentDepartments(){
		return currentDepartments;
	}
	
	/**
	 * adding a new department to college
	 * @param department a Department object
	 */
	public void addDepartment(Department department){
		if (currentDepartments < maxDepartments){
			departments[currentDepartments] = department;
			currentDepartments++;
		} 	
		else{
			System.out.println("College is full!!!");
		}
	}
	
	/**
	 * calculating the average of all students in this college
	 */
	public void calculateAvg(){
		int sum = 0;
		int count = 0;
		
		for(int i = 0; i < currentDepartments; i++){
			sum += departments[i].getAvg();
			count++;
		}
		
		avg = sum/count;
	}
	
	/**
	 * 
	 * @return the average of all students in this college
	 */
	public int getAvg(){
		calculateAvg();
		return avg;
	}	
	
	public void print(){
		for(int i = 0; i < currentDepartments; i++){
			System.out.println("Department name: " + departments[i].getName());
			departments[i].print();
		}
		calculateAvg();
		System.out.println("Average of all student grades in this college: " + avg);
	}

}
