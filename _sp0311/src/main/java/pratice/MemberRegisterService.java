package pratice;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberRegisterService {

	@Autowired
	private MemberDao memberDao;

	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public void regist() {
		memberDao.process();
		System.out.println("register()");
	}
}
