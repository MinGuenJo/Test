package tommy.spring.polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
//	=============================================================
//	public LgTV() {
//		System.out.println("LgTV 객체 생성");
//	}
//	@Override
//	public void powerOn() {
//		System.out.println("LgTV 전원을 켠다.");
//	}
//	@Override
//	public void powerOff() {
//		System.out.println("LgTV 전원을 끈다.");
//	}
//	@Override
//	public void volumeUp() {
//		System.out.println("LgTV 불륨을 올린다.");
//	}
//	@Override
//	public void volumeDown() {
//		System.out.println("LgTV 불륨을 내린다.");
//	}
//	=============================================================	
	@Autowired
//	@Qualifier("apple")
//	@Resource(name="sony")
	private Speaker speaker;
	public LgTV() {
		System.out.println("===> LgTV 객체 생성");
	}
	@Override
	public void powerOn() {
		System.out.println("LgTV 전원을 켠다.");
	}
	@Override
	public void powerOff() {
		System.out.println("LgTV 전원을 끈다.");
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
