// 20142697 ±Ç¹Î¼ö BasePlusCommisionEmployee.java
public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String first, String last, String bday, String hdate,
			double sales, double rate, double salary) {
		super(first, last, bday, hdate, sales, rate);
		setBaseSalary(salary);
	}
	
	/**	sets the base salary of the employee
	 * 
	 * @param salary	The base salary
	 */
	public void setBaseSalary(double salary) {
		baseSalary = (salary < 0.0) ? 0.0 : salary;
	}
	
	/** gets the base salary of the employee
	 * 
	 * @return	The base salary
	 */
	public double getBaseSalary() {
		return baseSalary;
	}
	
	/** gets the earnings of the employee
	 * 
	 * @return the earnings based on base salary, gross sales, and commission rate
	 */
	public double earnings() {
		return getBaseSalary() + super.earnings();
	}
	
	public String toString() {
		return String.format("%s %s; %s: $%,.2f",
				"base-salaried", super.toString(),
				"base salary", getBaseSalary());
	}
}
