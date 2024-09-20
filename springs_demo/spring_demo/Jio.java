package springs_demo.spring_demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Qualifier
public class Jio implements Sim{

	@Autowired
	List<Long> mobileNumbers;

	@Override
	public String toString() {
		return "Jio [mobileNumbers=" + mobileNumbers + "]";
	}
	
}
