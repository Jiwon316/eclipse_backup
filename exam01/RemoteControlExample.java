package exam01;

public class RemoteControlExample {

	public static void main(String[] args) {
		//익명인터페이스 사용
		RemoteControl rc = new RemoteControl() {
		public void turnOn() {
			System.out.println("Power Turn On");
		}
		public void turnOff() {
			System.out.println("Power Turn Off");
		}
		public void setVolume(int volume) {/*실행문*/}
		};
		
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		RemoteControl.changeBattery();
		
	}

}
