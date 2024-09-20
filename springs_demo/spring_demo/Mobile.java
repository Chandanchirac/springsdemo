package springs_demo.spring_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
@Lazy(value = false)
public class Mobile {
	@Autowired
	Sim sim;

	@Override
	public String toString() {
		return "Mobile [sim=" + sim + "]";
	}

}
