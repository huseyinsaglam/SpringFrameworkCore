package _01.setter.injection.model;

public class Department { // Bolum;
	
	private String deptname;
	private String location;
	
	
	
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	@Override
	public String toString() {
		return "Department [deptname=" + deptname + ", location=" + location + "]";
	}
	
	
	

}
