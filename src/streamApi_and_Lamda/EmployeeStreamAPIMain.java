package streamApi_and_Lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStreamAPIMain {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();
		Employee emp = new Employee("Thirupathi", 25, 25000);
		Employee emp2 = new Employee("Gopi", 26, 26000);
		Employee emp3 = new Employee("Ravi", 27, 27000);
		Employee emp4 = new Employee("Nag", 24, 24000);
		Employee emp5 = new Employee("AAA", 23, 23000);
		employees.add(emp);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);

		System.out.println(" First salary : " + employees);
		
		List<Employee> Incrementemployees = employees.stream().map(e -> {
			if (e.getAge() > 25) {
				e.setSalary(e.getSalary() * 1.10);
			}
			return e;
		}).collect(Collectors.toList());
		
		System.out.println(" After increment salary : " + Incrementemployees);

	}

}
