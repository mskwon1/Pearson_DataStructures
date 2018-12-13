// 20142697 ±Ç¹Î¼ö CommissionEmployee.java
public class PieceEmployee extends Employee {
	private int unitNums;
	private double payPerUnit;
	
	public PieceEmployee(String first, String last, String bday, String hdate,
			int units, double pay) {
		super(first, last, bday, hdate);
		setUnitNums(units);
		setPayPerUnit(pay);
	}
	
	public void setUnitNums(int units) {
		unitNums = units;
	}
	
	public int getUnitNums() {
		return unitNums;
	}
	
	public void setPayPerUnit(double pay) {
		payPerUnit = pay;
	}
	
	public double getPayPerUnit() {
		return payPerUnit;
	}
	
	
	/** gets the earnings of the employee
	 * 
	 * @return the earnings based on gross sales and commission rate
	 */
	public double earnings() {
		return getUnitNums() * getPayPerUnit();
	}
	
	public String toString() {
		return String.format("%s: %s\n%s: %d; %s: $%.2f",
				"piece employee", super.toString(),
				"number of pieces", getUnitNums(),
				"pay per piece", getPayPerUnit());
	}
}
