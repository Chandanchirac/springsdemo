package springs_demo.spring_demo;

import java.awt.Container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {
public static void main(String[] args) {
	ApplicationContext container=new AnnotationConfigApplicationContext(Myconfig.class);
	System.out.println(container.getBean("mobile"));///id is passed
	
}
}
