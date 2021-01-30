package sprint.bootexample.sprintbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("sprint.bootexample.sprintbootexample.PostandGet")
@SpringBootApplication
public class SprintBootExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintBootExampleApplication.class, args);
	}
	
}
