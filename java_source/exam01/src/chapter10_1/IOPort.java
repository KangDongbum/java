package chapter10_1;

public interface IOPort {
	public String type = "DIV"; // �������̽� -> public static final�� ������ �ڵ����� �߰�
	public String portType(); // RGB, DVI, HDMI // abstract ���� ������ �ڵ� �߰�
}