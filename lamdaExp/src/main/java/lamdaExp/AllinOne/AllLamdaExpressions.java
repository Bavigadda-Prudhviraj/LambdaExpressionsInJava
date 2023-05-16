package lamdaExp.AllinOne;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class AllLamdaExpressions {

	public static void main(String[] args) {
		ArrayList<Employee> aList=new ArrayList<>();
		aList.add(new Employee("David", 50000, "Male"));
		aList.add(new Employee("John", 30000, "Male"));
		aList.add(new Employee("Scoot", 20000, "Male"));
		aList.add(new Employee("mary", 60000, "FeMale"));
		System.out.print(aList);
		
		//Function takes input and return mentioned data type
		Function<Employee, Integer> function=emp->{
												 int sal=emp.getSalary();
												 emp.setSalary((sal*10)/100);
												 return emp.getSalary();
												};
		//Predicate(return true or false);
		Predicate<Integer> predicate=n->n>5000;
		
		
		//Consumer it consumes data don't return any values;
		Consumer<Employee> consumer=emp->{
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
			System.out.println(emp.getGender());
		};
		
		for(Employee al:aList) {
			int bonous=function.apply(al);
			if(predicate.test(bonous)) {
				consumer.accept(al);
			}
		}
		System.out.println(aList);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
class Employee{
	String name;
	int salary;
	String gender;
	public Employee(String name, int salary, String gender) {
		super();
		this.name = name;
		this.salary = salary;
		this.gender = gender;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", gender=" + gender + "]";
	}
	
}