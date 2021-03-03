//추상화,interface
package day_17_1;

abstract class Ab01{
	private int num;
	public void setNum(int num) {this.num = num;}
	public int getNum() {return num;}
	public abstract void combo(); //추상화
}

class NAb01 extends Ab01{

	@Override
	public void combo() { //무조건 자식에서 만들어야한다.
			
	}
}

public class MainClass {
	public static void main(String[] args) {
		NAb01 abs = new NAb01();
		abs.setNum(5);
		abs.combo();
	}
}
