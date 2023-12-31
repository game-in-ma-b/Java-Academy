package quiz11;

public class Computer {
	//1. 키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요
	
	//2.기본생성자를 생성하고, 변수를 클래스로 초기화 하세요

	//3.KeyBoard, Mouse, Monitor를 전달받는 생성자를 생성하세요.

	//4.키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요
	
	//5.키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요	
		
	
	//6.메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
	private KeyBoard keyBoard;
	private Monitor monitor;
	private Mouse mouse;
	
	public void setKeyBoard(KeyBoard keyBoard) {
		this.keyBoard = keyBoard;
	}
	public KeyBoard getKeyBoard() {
		return keyBoard;
		//멤버 변수도 객체
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	public Mouse getMouse() {
		return mouse;
	}
	
	Computer(){
		this.monitor = new Monitor();
		this.keyBoard = new KeyBoard();
		this.mouse  = new Mouse();
	}
	
	Computer(Monitor monitor,KeyBoard keyBoard,	Mouse mouse ){
		this.monitor = monitor;
		this.keyBoard = keyBoard;
		this.mouse  = mouse;
	}
	
	void ComputerInfo() {
		keyBoard.info();
		monitor.info();
		mouse.info();
	}
	
	
}
