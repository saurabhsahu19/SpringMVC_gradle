package configuration;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.saurabh.Employee;

@Configuration
public class EmployeeConfiguration {
	
    @Bean(autowire=Autowire.BY_NAME)
	Employee employee(){
		return new Employee();
	}
}
