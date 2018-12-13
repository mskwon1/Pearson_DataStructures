// 20142697 권민수 Employee.java
import java.util.Date;
import java.text.SimpleDateFormat;

public abstract class Employee implements Comparable<Employee> {
	private String firstName;
	private String lastName;
	private int ssn;
	private String birthday;
	private String hireDate;
	private static int numOfEmployees = 0;
	
	public Employee(String first, String last, String bday, String hdate) {
		numOfEmployees++;
		firstName = first;
		lastName = last;
		ssn = numOfEmployees;
		birthday = bday;
		hireDate = hdate;
	}
	
	/** sets the first name
	 * 
	 * @param first	The first name of the employee
	 */
	public void setFirstName(String first) {
		firstName = first;
	}
	
	/** gets the first name
	 * 
	 * @return the first name of the employee
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/** sets the last name
	 * 
	 * @param last	The last name of the employee
	 */
	public void setLastName(String last) {
		lastName = last;
	}
	
	/** gets the last name
	 * 
	 * @return the last name of the employee
	 */
	public String getLastName() {
		return lastName;
	}
	
	/** sets the SSN
	 * 
	 * @param ssn	The Social Security Number of the employee
	 */
	public void setSSN(int num) {
		ssn = num;
	}
	
	/** gets the SSn
	 * 
	 * @return the social security number of the employee
	 */
	public int getSSN() {
		return ssn;
	}
	
	/** sets the birthday
	 * 
	 * @param bday	The birthday of the employee
	 */
	public void setBirthday(String bday) {
		birthday = bday;
	}
	
	/** gets the birthday
	 * 
	 * @return the birthday of the employee
	 */
	public String getBirthday() {
		return birthday;
	}
	
	/** sets the hire date
	 * 
	 * @param hdate	The hire date of the employee
	 */
	public void setHireDate(String hdate) {
		hireDate = hdate;
	}
	
	/** gets the hire date
	 * 
	 * @return the hire date of the employee
	 */
	public String getHireDate() {
		return hireDate;
	}
	
	/** checks if the month of the employee's birthday is same as current date's month
	 * 
	 * @return True if the month is same
	 */
	public boolean isBirthday() {
		String today = new SimpleDateFormat("yyyyMMdd").format(new Date());
		if(this.getBirthday().substring(4, 6).equals(today.substring(4, 6)))
			return true;
		else
			return false;
	}
	
	/** checks if the employee has been working for more than 10 years
	 * 
	 * @return True if the employee has been working for more than 10 years
	 */
	public boolean isTenYears() {
		String today = new SimpleDateFormat("yyyyMMdd").format(new Date());
		
		int year = Integer.parseInt(this.getHireDate().substring(0,4));
		int month = Integer.parseInt(this.getHireDate().substring(4,6));
		int day = Integer.parseInt(this.getHireDate().substring(6,8));
		int tyear = Integer.parseInt(today.substring(0,4));
		int tmonth = Integer.parseInt(today.substring(4,6));
		int tday = Integer.parseInt(today.substring(6,8));
		
		if (year+10<tyear) 
			return true;
		else if((year+10 == tyear) && (month<tmonth)) 
			return true;
		else if((year+10 == tyear) && (month<tmonth) && (day<=tday))
			return true;
		else 
			return false;
	}
	
	public String toString() {
		return String.format("%s %s \nbirthday: %s \nhired date: %s \nsocial security number : %s",
				getFirstName(), getLastName(), getBirthday(), getHireDate(), getSSN());
	}
	
	/** checks the bonus
	 * 
	 * @return value of total earnings, bonus included
	 */
	public double totalEarnings() {
		double total = this.earnings();
		// 오늘 날짜가 100000원(100달러로 환산) 보너스
		if (this.isBirthday())	
			total += 100.0;
		// 근속기간 10년 넘었을경우 10퍼센트 보너스
		if (this.isTenYears())
			total *= 1.1;
		return total;
	}
	
	/** gets the earning of the employee
	 * 
	 * @return the earning that the employee gets - differs by the type of the employee
	 */
	public abstract double earnings();	// abstract class
	
	/** 
	 * compares SSN to target Employee
	 * @param target Employee to compare to
	 * @return -1 if this < target
	 * 			0 if this == target
	 * 			1 if this > target
	 */
	public int compareTo(Employee target) {
		return ssn - target.getSSN();
	}
}
