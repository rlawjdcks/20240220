package spring;


public class Client2{

	private String host;
	
	public void setHost(String host) {
		System.out.println("setHost() 실행");
		this.host = host;
	}


	public void connect() {
		System.out.println("Client2.connect() 실행");
		
	}
	
	public void Send(){
		System.out.println("client.send() to " + host);
	}
	
	
	public void close(){
		System.out.println("Client2.close() 실행");
	}

}
