package net.javaguides.sms;

import net.javaguides.sms.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Employee;

@SpringBootApplication
public class EmployeeManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Employee employee1 = new Employee("Rafael", "Cervera", "rafael@gmail.com");
		employeeRepository.save(employee1);

		Employee employee3 = new Employee("Elon", "Musk", "elon@gmail.com");
		employeeRepository.save(employee3);

		Employee employee4 = new Employee("Bill", "Gates", "bill@gmail.com");
		employeeRepository.save(employee4);

		Employee employee5 = new Employee("Jeff", "Bezos", "steve@gmail.com");
		employeeRepository.save(employee5);

		Employee employee6 = new Employee("Steve", "Jobs", "natasha@gmail.com");
		employeeRepository.save(employee6);


	}
}
