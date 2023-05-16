package lamdaExp.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateWithObjects {

	public static void main(String[] args) {
		Employee emp1=new Employee("Bavigadda",54000, 1);
		Employee emp2=new Employee("prudhvi",50000, 3);
		Employee emp3=new Employee("raj",60000, 5);
		ArrayList<Employee> ele=new ArrayList<>();
		ele.add(emp1);
		ele.add(emp2);
		ele.add(emp3);
		
		//salary should be greater than 50k and exp >3
		Predicate<Employee> predicate=e->(e.getExprience()<3 && e.getSalary()<60000);
		for(int i=0;i<ele.size();i++) {
			if(predicate.test(ele.get(i))) {
				System.out.print(ele.get(i).getName());
			}
		}
		
	}

}
class Employee{
	String name;
	int salary;
	int exprience;
	
	public Employee(String name, int salary, int exprience) {
		super();
		this.name = name;
		this.salary = salary;
		this.exprience = exprience;
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

	public int getExprience() {
		return exprience;
	}

	public void setExprience(int exprience) {
		this.exprience = exprience;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", exprience=" + exprience + "]";
	}
	
	
}

