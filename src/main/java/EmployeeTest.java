import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.saurabh.Employee;

import configuration.EmployeeConfiguration;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext();
		acac.register(EmployeeConfiguration.class);
		acac.refresh();
		Employee emp = (Employee)acac.getBean("employee");
		System.out.println(emp);
	}

}
