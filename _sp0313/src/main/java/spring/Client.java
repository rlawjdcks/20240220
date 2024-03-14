package spring;

import org.apache.catalina.ha.backend.Sender;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Client implements  InitializingBean, DisposableBean{

	private String host;
	
	public void setHost(String host) {
		System.out.println("setHost() 실행");
		this.host = host;
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Client.afterPropertiesSet() 실행");
		
	}
	
	public void Send(){
		System.out.println("client.send() to " + host);
	}
	
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Client.destroy() 실행");
	}

}
