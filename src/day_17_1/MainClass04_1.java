package day_17_1;
//interface를 사용
//지상군 공격,방어 기능
//공군 공격,방어기능
interface A공방{
	public void attack();//공격시 사용
	public void defense();//방어시 사용
}

class A지상군1 implements A공방{
	@Override
	public void attack() {
		System.out.println("지상군이 공격합니다");
		
	}
	@Override
	public void defense() {
		System.out.println("지상군이 방어합니다");
	}
}

class A공군1 implements A공방{
	@Override
	public void attack() {
		System.out.println("공군이 공격합니다");
	}
	@Override
	public void defense() {
		System.out.println("공군이 방어합니다");	
	}
}

public class MainClass04_1 {
	public static void main(String[] args) {
	 A공방 army = new A지상군1(); //업케스팅
	 army.attack();
	 army.defense();
	
	 army = new A공군1();
	 army.attack();
	 army.defense();
	}
}






