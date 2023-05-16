package lamdaExp.functionInterface;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

import javax.sound.midi.SysexMessage;

public class FunctionWithObjects {

	public static void main(String[] args) {
		ArrayList<Employee> employees=new ArrayList<>();
		employees.add(new Employee("raj", 1000, 1));
		employees.add(new Employee("Bvaigadda", 4000, 4));
		employees.add(new Employee("prudhvi", 2000, 3));
		employees.add(new Employee("kalyan", 5000, 5));
		employees.add(new Employee("vasu", 3000, 2));
		//function should collection salary increase the salary with 10%
		Function<Employee,Integer> hike=emp->{
			int h=emp.getSalary()*((emp.getSalary()/100)*10);
			return h;
			};
		System.out.println(employees);
		for(Employee ele:employees) {
			ele.setSalary(hike.apply(ele));
		}
		System.out.println(employees);
		for(Employee ele:employees) {
			int bonous=hike.apply(ele);
			ele.setSalary(bonous);
		}
		System.out.println(employees);
		System.out.print("\n"+"Predicate with function"+"\n");
		Predicate<Integer> predicate=n->n>30000;
		for(Employee ele:employees) {
			int bonous=hike.apply(ele);
			if(predicate.test(bonous)) {
				System.out.println(ele.getName()+" "+ele.getSalary());
				ele.setSalary(bonous);
				System.out.println(ele.getName()+" "+ele.getSalary());
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

