package Oops_Encapsulation;

public class _1_Company {
	
	public String name;
	public int empCount;
	private String ceoName;
	private int revenue;
	
	
//	Getter and Setter method
	
	public void setName(String name)
	{
//		name = "Accenture";
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	
	public void setEmpCount(int empCount)
	{
		int emp = empCount + 100;
		this.empCount = emp;
	}
	
	public int getEmpCount()
	{
//		int emp = empCount + 100;
		return empCount;
	}
	
	
	
	
	
	
	
	
	
	

	
}