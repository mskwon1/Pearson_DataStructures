// 20142697 ±Ç¹Î¼ö HourlyEmployee.java
public class HourlyEmployee extends Employee {
	private double wage;
	private double hours;
	
	public HourlyEmployee(String first, String last, String bday, String hdate, 
			double hourlyWage, double hoursWorked) {
		super(first, last, bday, hdate);
		setWage(hourlyWage);
		setHours(hoursWorked);
	}
	
	/** sets the wage of the employee
	 * 
	 * @param hourlyWage	the wage of the employee
	 */
	public void setWage(double hourlyWage) {
		wage = (hourlyWage < 0.0) ? 0.0 : hourlyWage;
	}
	
	/** gets the wage of the employee
	 * 
	 * @return	the wage of the employee
	 */
	public double getWage() {
		return wage;
	}
	
	/** sets the worked hours for the employee
	 * 
	 * @param hoursWorked	how many hours the employee worked this month
	 */
	public void setHours(double hoursWorked) {
		hours = ((hoursWorked >= 0.0) && (hoursWorked <= 168.0)) ? hoursWorked : 0.0;
	}
	
	/** gets the worked hours for the employee
	 * 
	 * @return	the worked hours for the employee
	 */
	public double getHours() {
		return hours;
	}
	
	/** gets the earnings of the employee
	 * 
	 * @return	the earnings based on worked hours and wage per hour
	 */
	public double earnings() {
		if (getHours() <= 40)
			return getWage() * getHours();
		else
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
	}
	
	public String toString() {
		return String.format("hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
				super.toString(), "hourly wage", getWage(),
				"hours worked", getHours());
	}
}
