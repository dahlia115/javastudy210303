package day_17;

class A{ //final이 들어가면 상속X
	public void test() {
		System.out.println("부모입니다.");
	}
	public void a(int a) {
		
	}
}
class B extends A{ 
	public void test() {
		System.out.println("변경합니다.");
	}
	public void a(int a) {
		//자식은 부모보다 범위가 작을수 없다.
	}
}

public class MainClass02 {
	public static void main(String[] args) {
		B b = new B();
		b.test();
		
	}
}
