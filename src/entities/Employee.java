package entities;

public class Employee implements Comparable<Employee> {
	
	private String name;
	private Double salary;
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	/*@Override
	funcion�rios ordenados por nome
	public int compareTo(Employee other) {
		return name.compareTo(other.getName());
	}*/
	
	/*@Override
	//funcion�rios ordenados por sal�rio
	public int compareTo(Employee other) {
		return salary.compareTo(other.getSalary());
	}*/
	
	@Override
	//ordem descrecente de sal�rio
	public int compareTo(Employee other) {
		return -salary.compareTo(other.getSalary());
	}	
}
