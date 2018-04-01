public class BaseCommissionEmployee extends CommissionEmployee{
	
	private double baseSalary;

	public BaseCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, 
				double grossSales, double commissionRate, double baseSalary)
	{
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

		if(baseSalary < 0.0)
			System.out.println("Base Salary must be positive. ");

		this.baseSalary = baseSalary;
	}

	public void setBaseSalary(double baseSalary)
	{
		if(baseSalary < 0.0)
			System.out.println("Base Salary must be positive. ");

		this.baseSalary = baseSalary;
	}

	public double getBaseSalary()
	{
		return baseSalary;
	}

	@Override
	public double earnings()
	{
		return getBaseSalary() + super.earnings();
	}

	@Override
	public String toString(){
		return String.format("%s %s; %s $%,.2f", "Base Salaried: ", super.toString(), 
							"Base Salary: ", getBaseSalary());
	}

}

