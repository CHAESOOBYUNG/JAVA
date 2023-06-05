package sec06.exam02_Queue;

public class Message {
	public String command; //메시지 종류
	public String to; //보내는 대상
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}
