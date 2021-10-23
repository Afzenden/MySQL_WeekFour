package msqlw4;

public class Monkey {
	
	public String name;
	public int emp_no;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Monkey(String name, int emp_no) {
		this.name = name;
		this.emp_no = emp_no; 
	}
	
	public Monkey(String name) {
		this.name = name;
	}

	public int getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	
	
	

}
