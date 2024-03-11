package optional;

import java.util.Optional;

class Bbb {
	int x;
	
	public Bbb(int x) {
		this.x = x;
	}

	void print() {
		System.out.println("Bbb : " + x);
	}
}

class Aaa {
	void print(Bbb bbb) {
		bbb.print();
	}
}
public class OptionalMain {

	public static void main(String[] args) {
		Aaa aaa = new Aaa();
//		Bbb bbb = new Bbb(100); // 값이 예상 안됨
		Bbb bbb = null; // 값이 예상 안됨
		
		Optional<Bbb> bb1 = Optional.ofNullable(bbb);
		System.out.println(bb1);
		aaa.print(bb1.orElseGet(()-> new Bbb(0)));
	}

}
