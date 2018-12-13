// 20142697 ±Ç¹Î¼ö SalariedEmployee.java
public class SalariedEmployee extends Employee {
	private double monthlySalary;
	
	public SalariedEmployee(String first, String last, String bday, String hdate, double salary) {
		super(first, last, bday, hdate);
		setMonthlySalary(salary);
	}
	
	/** sets the monthly salary of the employee
	 * 
	 * @param salary the monthly salary of the employee
	 */
	public void setMonthlySalary(double salary) {
		monthlySalary = salary < 0.0 ? 0.0 : salary;
	}
	
	/** gets the monthly salary of the employee
	 * 
	 * @return the monthly salary of the employee
	 */
	public double getMonthlySalary() {
		return monthlySalary;
	}
	
	/** gets the earnings of the employee
	 * 
	 * @return the earnings based on monthly salary
	 */
	public double earnings() {
		return getMonthlySalary();
	}
	
	public String toString() {
		return String.format("salaried emplpoyee: %s\n%s: $%,.2f",
				super.toString(), "monthly salary", getMonthlySalary());
	}
}
