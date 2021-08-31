package chapter10_1;

public class Monitor implements Display, MainBoard, PowerSuply, IOPort{
	
	@Override
	public String portType() {
		System.out.println(IOPort.type);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String displayType() {
		// TODO Auto-generated method stub
		return null;
	}

}
