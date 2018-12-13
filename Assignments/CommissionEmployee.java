// 20142697 ±Ç¹Î¼ö CommissionEmployee.java
public class CommissionEmployee extends Employee {
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee(String first, String last, String bday, String hdate,
			double sales, double rate) {
		super(first, last, bday, hdate);
		setGrossSales(sales);
		setCommissionRate(rate);
	}
	
	/** sets the commission rate
	 * 
	 * @param rate	The commission rate
	 */
	public void setCommissionRate(double rate) {
		commissionRate = (rate > 0.0 && rate < 1.0) ? rate : 0.0;
	}
	
	/** gets the commission rate
	 * 
	 * @return	The commission rate
	 */
	public double getCommissionRate() {
		return commissionRate;
	}
	
	/** sets the gross sales of the employee
	 * 
	 * @param sales 	The gross sales of the employee
	 */
	public void setGrossSales(double sales) {
		grossSales = (sales < 0.0) ? 0.0 : sales;
	}
	
	/** gets the gross sales of the employee
	 * 
	 * @return	The gross sales of the employee
	 */
	public double getGrossSales() {
		return grossSales;
	}
	
	/** gets the earnings of the employee
	 * 
	 * @return the earnings based on gross sales and commission rate
	 */
	public double earnings() {
		return getCommissionRate() * getGrossSales();
	}
	
	public String toString() {
		return String.format("%s: %s\n%s: $%,.2f; %s: %.2f",
				"commission employee", super.toString(),
				"gross sales", getGrossSales(),
				"commission rate", getCommissionRate());
	}
}
