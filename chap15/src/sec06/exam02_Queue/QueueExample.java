package sec06.exam02_Queue;

import java.util.*;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		//메시지 저장
		messageQueue.offer(new Message("sendMail", "채수병"));
		messageQueue.offer(new Message("sendSMS", "오타니"));
		messageQueue.offer(new Message("sendKakaotalk", "트라웃"));
		
		while(!messageQueue.isEmpty()) { //메시지 큐가 비었는지 확인
			Message message = messageQueue.poll(); //큐로부터 객체를 가져옴 (객체는 큐에서 제거) (메시지 큐에서 한개의 메시지 꺼냄)
			switch (message.command) {
				case "sendMail":
					System.out.println(message.to + "님에게 메일을 보냅니다.");
					break;
				case "sendSMS":
					System.out.println(message.to + "님에게 SMS를 보냅니다.");
					break;
				case "sendKakaotalk":
					System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
					break;
			}
		}
		
	}
}
