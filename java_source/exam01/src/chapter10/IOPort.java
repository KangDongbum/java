package chapter10;

public interface IOPort {
	public String type = "DIV"; // 인터페이스 -> public static final이 컴파일 자동으로 추가
	public String portType(); // RGB, DVI, HDMI // abstract 예약어가 컴파일 자동 추가
}
