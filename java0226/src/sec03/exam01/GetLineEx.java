package sec03.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class GetLineEx {

	public static void main(String[] args) throws IOException {

		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		while (true) {
			System.out.println("입력 : ");
			String lineStr = br.readLine();
			if (lineStr.equals("q") || lineStr.equals("quit")) {
				break;
			}
			System.out.println("입력내용 : "+lineStr);
		}
		br.close();
	}

}
