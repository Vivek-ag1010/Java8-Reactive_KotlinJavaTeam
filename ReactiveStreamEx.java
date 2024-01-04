/*Create a Java program to simulate the combination of two Flux streams and filter their elements. 
Assume a Employee class with an employeeId, salary, and department. 
Implement a reactive pipeline to combine two streams of employees, filter those from a specific department, and then print the results.*/

package reactiveStreams;

import reactor.core.publisher.Flux;

class Employee1
{
	int employeeId;
	int salary;
	String department;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Employee1(int employeeId, int salary, String department) {
		super();
		this.employeeId = employeeId;
		this.salary = salary;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee1 [employeeId=" + employeeId + ", salary=" + salary + ", department=" + department + "]";
	}
}
public class ReactiveStreamEx {

	public static void main(String[] args) {
		Flux<Employee1> empFlux1=Flux.just(
				new Employee1(101, 54000, "IT"),
				new Employee1(102, 40000, "HR"),
				new Employee1(103, 30000, "Sales"),
				new Employee1(104, 60000, "IT")
				);
		Flux<Employee1> empFlux2=Flux.just(
				new Employee1(12, 30000, "IT"),
				new Employee1(3, 10000, "Sales"),
				new Employee1(5, 35000, "Sales"),
				new Employee1(6, 42000, "Trainee"),
				new Employee1(34, 5500, "Marketing")
				);
		Flux.concat(empFlux1,empFlux2).filter(a->"Sales".equals(a.getDepartment())).subscribe(System.out::println);

	}

}
