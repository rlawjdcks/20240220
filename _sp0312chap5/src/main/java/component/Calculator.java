package component;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

	 public Double add(double x , double y) {
		 return x + y;
	 }
}
