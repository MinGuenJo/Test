package tommy.spring.polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
//	=============================================================
//	public LgTV() {
//		System.out.println("LgTV ��ü ����");
//	}
//	@Override
//	public void powerOn() {
//		System.out.println("LgTV ������ �Ҵ�.");
//	}
//	@Override
//	public void powerOff() {
//		System.out.println("LgTV ������ ����.");
//	}
//	@Override
//	public void volumeUp() {
//		System.out.println("LgTV �ҷ��� �ø���.");
//	}
//	@Override
//	public void volumeDown() {
//		System.out.println("LgTV �ҷ��� ������.");
//	}
//	=============================================================	
	@Autowired
//	@Qualifier("apple")
//	@Resource(name="sony")
	private Speaker speaker;
	public LgTV() {
		System.out.println("===> LgTV ��ü ����");
	}
	@Override
	public void powerOn() {
		System.out.println("LgTV ������ �Ҵ�.");
	}
	@Override
	public void powerOff() {
		System.out.println("LgTV ������ ����.");
	}
	@Override
	public void volumeUp() {
		speaker.volumeUP();
	}
	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
		
}
