package anno2;

import anno1.MyAnnotation;

public class Target {

	@MyAnno(value =  "연습")
	@MyAnnotation(value = "테스트트")
	public void sub() {
		System.out.println("Target");
	}
}
