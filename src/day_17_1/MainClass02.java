//추상화,interface
package day_17_1;

interface TestInterface { 
	//인터페이스는 코드를 가질 수 없다,메소드만 정의
	public void test();
	public void abc();
}
class AAA{
	public void print() {
		System.out.println("출력");
	}
}
class TestClass extends AAA implements TestInterface{
	@Override
	public void test() {
			print();
	}
	@Override
	public void abc() {
			
	}
	
}


public class MainClass02 {
	public static void main(String[] args) {
		
	}
}
