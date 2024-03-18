package pro;
class Berry {
	String str;
	void frt() {
		str = "Berry";
		func();
	}
	void func() {
		System.out.println(str);
	}
}
class Apple extends Berry {
	String str;
	void func() {
		str = "Apple";
		super.func();
		System.out.println(str);
	}
}
public class Test {
	public static void main(String[] args) {
		Berry A = new Apple();
		A.frt();
	}
}