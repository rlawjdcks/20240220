package pratice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainForSpring {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Appctx.class);
		
		MemberRegisterService mrs = ctx.getBean(MemberRegisterService.class);
		ChangePasswordService cps = ctx.getBean(ChangePasswordService.class);
		mrs.regist();
		cps.changePassword();
		
		ctx.close();
	}

}
