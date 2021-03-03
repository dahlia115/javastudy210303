//오버라이딩 연습
package day_17;

class Ferrari{
	private int ye;
	public Ferrari(int ye) {this.ye = ye;}
	public int getYe() {return ye;}
	public void speed() {
		System.out.println(ye+"년식 페라리 속도 : 300km");
		}
}

class NewFerrari extends Ferrari{
	public NewFerrari(int ye) { super(ye); }
	public void autoSystem() { 
		System.out.println("자동 운전 모드");} //기능추가
	public void speed() { //부모와 같은 타입과 똑같이 만들어 쓴다.
		System.out.println(getYe()+"년식 페라리 속도 : 400km");
	}
}

public class MainClass01 {
	public static void main(String[] args) {
		//Ferrari f = new Ferrari(2021);
		//f.speed();
		NewFerrari nf = new NewFerrari(2022);
		nf.speed();
		nf.autoSystem();
	}
}
