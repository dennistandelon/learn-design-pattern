package iterator.model;

public class Employee {

	private String name;
	private Integer salary;
	
	public Employee(String name, Integer salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s", this.name, this.salary);
	}

}
