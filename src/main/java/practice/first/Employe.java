package practice.first;

public class Employe {

	private long empID;
	private String empName;
	private String empCompanyName;
	
	
	
	public Employe(long empID, String empName, String empCompanyName) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empCompanyName = empCompanyName;
	}

	@Override
	public String toString() {
		return "Employe [empID=" + empID + ", empName=" + empName + ", empCompanyName=" + empCompanyName + "]";
	}

	public long getEmpID() {
		return empID;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpCompanyName() {
		return empCompanyName;
	}
	
}
