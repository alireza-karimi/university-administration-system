/**
 * The Department class represents a department in a college and details about it
 * @author alireza karimi
 * @version 1.0.0
 */
public class Department {
	//department name
	private String name;
	//array of labs in this department
	private Lab[] labs;
	//number of maximum labs in this deparment
	private int maxLabs;
	//current number of labs in this department
	private int currentLabs;
	//average of all students in this department
	private int avg;
	//name of department chairpersion
	private String chairPerson;
	
	/**
	 * creating a new department in college and specifying its details
	 * @param name name of department
	 * @param maxLabs maximum number of labs in this department
	 * @param chairPerson name of department chairperson
	 */
	public Department(String name, int maxLabs, String chairPerson){
		this.name = name;
		this.maxLabs = maxLabs;
		labs = new Lab[maxLabs];
		this.chairPerson = chairPerson;
		currentLabs = 0;
	}
	
	/**
	 * get the name of department
	 * @return name of department
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * set name of department
	 * @param name name of department
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * get the department chairperson
	 * @return department chairperson
	 */
	public String getChairPerson(){
		return chairPerson;
	}
	
	/**
	 * set the department chairperson
	 * @param chairPerson department chairperson
	 */
	public void setChairPerson(String chairPerson){
		this.chairPerson = chairPerson;
	}
	
	/**
	 * get the maximum number of labs in this department
	 * @return maximum number of labs in this department
	 */
	public int getMaxLabs(){
		return maxLabs;
	}
	
	/**
	 * get number of current labs in this department
	 * @return number of current labs in this department
	 */
	public int getCurrentLabs(){
		return currentLabs;
	}
	
	/**
	 * adding a lab to department
	 * @param lab a Lab object
	 */
	public void addLab(Lab lab){
		
		if (currentLabs < maxLabs){
			labs[currentLabs] = lab;
			currentLabs++;
		} 	
		else{
			System.out.println("Department is full!!!");
		}
	}
	
	/**
	 * calculating the average of all students in this department
	 */
	public void calculateAvg(){
		int sum = 0;
		int count = 0;
		
		for(int i = 0; i < currentLabs; i++){
			sum += labs[i].getAvg();
			count++;
		}
		
		avg = sum/count;
	}
	
	/**
	 * get the average of all students in this department
	 * @return average of all students in this department
	 */
	public int getAvg(){
		calculateAvg();
		return avg;
	}
	
	/**
	 * printing all labs students and each lab average in this department
	 * and average of all students in this department
	 */
	public void print(){
		for(int i = 0; i < currentLabs; i++){
			System.out.println("Lab number " + (i+1) + " details:");
			labs[i].print();
		}
		calculateAvg();
		System.out.println("Average of all student grades in this deparment: " + avg);
	}
}
