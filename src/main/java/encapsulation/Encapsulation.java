package encapsulation;

public class Encapsulation {
	//Encapsulation or data hiding
	//hiding data members(varialbles or methods)
	//private data variables cannot be accessed directly from outside of the class.

	//how to implement encapsulation
	//this.variable =variable 
	//(thos.variable is class variable and =variable is local variable.

	private int ssn;
	private String empname;
	private int empAge;

	public static void main(String[] args) {

		Encapsulation emp = new Encapsulation();
		emp.setEmpAge(25);
		emp.setSsn(123456);
		emp.setEmpname("Hema");
		// TODO Auto-generated method stub
		System.out.println(emp.getEmpAge());
		System.out.println(emp.getEmpname());
		System.out.println(emp.getSsn());

	}

	//getter and setter methods to set and get the values of the fields

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}
