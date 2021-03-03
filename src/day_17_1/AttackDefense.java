package day_17_1;

public interface AttackDefense {
	//인터페이스에서 변수를 만들 땐 static final이 있어야한다.
	//public int num;
	public static final String name = "홍길동"; //static final이면 변수명은 대문자
	public final int NUM1 = 500; //생략가능 
	public static int NUM2= 500;
	public void accack();
	public void defense();
}
