package com.prismit.corp.java.sreekanth.hashmap;

public class EmployeEx {

	public String empName;
	public int empId;
	public long empSSN;

	public EmployeEx(String empName, int empId, long empSSN) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSSN = empSSN;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.empId;
		result = prime * result + ((this.empName == null) ? 0 : this.empName.hashCode());
		result = prime * result + (int) (this.empSSN ^ (this.empSSN >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeEx other = (EmployeEx) obj;
		if (this.empId != other.empId)
			return false;
		if (this.empName == null) {
			if (other.empName != null)
				return false;
		} else if (!this.empName.equals(other.empName))
			return false;
		if (this.empSSN != other.empSSN)
			return false;
		return true;
	}

}
