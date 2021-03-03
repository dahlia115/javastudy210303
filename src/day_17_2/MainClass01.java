package day_17_2;
// 팀장 기본 틀 및 조합 하는 기능
// a 회원저장 기능과 회원 수 보여주는 기능 각각의 클래스 구현
// b 이달의 이벤트 보기와 전체 이벤트 보기 기능 각각의 클래스 구현
import java.util.Scanner;

interface MemberInterface{
	public void saveMember();
	public void memCount();
}
interface EventInterface{
	public void monthEvent();
	public void allEvent();
}
class Event implements EventInterface{

	@Override
	public void monthEvent() {
		System.out.println("이달의 이벤트 보기 기능입니다,");
		
	}

	@Override
	public void allEvent() {
		System.out.println("전체 이벤트 보기 기능입니다.");
		
	}
	
}
class Member implements MemberInterface{

	@Override
	public void saveMember() {
		System.out.println("회원 저장 기능입니다.");
		
	}

	@Override
	public void memCount() {
		System.out.println("회원 수 보기 기능입니다.");
		
	}
	
}


public class MainClass01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = 0;
		int choice = 0;
		while (true) {
			System.out.println("1.회원기능 2.이벤트기능");
			num = sc.nextInt();
			switch (num) {
			case 1: {
				//회원기능
				System.out.println("1.회원저장기능 2.회원보기기능");
				choice = sc.nextInt();
				MemberInterface m = new Member();
				if(choice == 1) {
					m.saveMember();
				}else if(choice == 2) {
					m.memCount();
				}
				
			}
			break;
			case 2: {
				//이벤트기능
				System.out.println("1.전체이벤트 2.이달이벤트");
				choice = sc.nextInt();
				EventInterface e = new Event();
				if(choice == 1) {
					e.allEvent();
				}else if(choice == 2) {
					e.monthEvent();
					
				}
			}
			break;

			}
		}
	}
}
