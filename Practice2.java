package reactiveStreams;

import reactor.core.publisher.Flux;

class Employee
{
	int EmpId;
	String name;
	int salary;
	String job;
	
	public Employee(int empId, String name, int salary, String job) {
		EmpId = empId;
		this.name = name;
		this.salary = salary;
		this.job = job;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", name=" + name + ", salary=" + salary + ", job=" + job + "]";
	}
	
}
public class Practice2 {

	public static void main(String[] args) {
		Flux<Employee> empFlux= Flux.just(
				new Employee(001, "abc", 12000, "Developer"),
				new Employee(003, "xyz", 10000, "Sales person"),
				new Employee(007, "hdb", 35000, "Developer"),
				new Employee(004, "ddd", 19000, "Engineer"),
				new Employee(010, "hsks", 8000, "Guard"),
				new Employee(015, "abc1", 45000, "Developer")
				);
		//print the details of all the employee
		empFlux.subscribe(employee->System.out.println("Details: "+employee));
		
	System.out.println();
		int threshold=11000;
		empFlux.filter(a->a.getSalary()>threshold).subscribe(aboveThres->System.out.println("Name: "+aboveThres.getName()+", Salary: "+aboveThres.getSalary()));
		
		
		//print the avrage salary
		empFlux.map(Employee::getSalary).reduce((a,b)->a+b).map(totalSum->totalSum/empFlux.count().block()).subscribe(avg->System.out.println("Average Salary: "+avg));
				
				
	}

}
