package springs_demo.spring_demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class Myconfig {
	@Bean
	List<Long> getMobileNumbers(){
		return Arrays.asList(9876543210l,9988776655l);
	}

}
