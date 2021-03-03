package day_17_1;
//interface를 사용하지 않을 경우
//지상군 공격,방어 기능
//공군 공격,방어기능

class A지상군{
	public void 지상군공격() {
		System.out.println("지상군이 공격합니다");
	}
	public void 지상군방어() {
		System.out.println("지상군이 방어합니다");
	}
}

class A공군{
	public void attack() {
		System.out.println("공군이 공격합니다");
	}
	public void 디펜스() {
		System.out.println("공군이 방어합니다");
	}
}

public class MainClass04 {
	public static void main(String[] args) {
	 A지상군 army = new A지상군();
	 army.지상군공격();
	 army.지상군방어();
	 A공군 airForce = new A공군();
	 airForce.attack();
	 airForce.디펜스();
	}
}






