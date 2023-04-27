package verify.exam06;

public class Chatting {
	void startChat(final String chatId) {
		/* String nickName = null;
		nickName = chatId; */
		String nickName = chatId;
		Chat chat = new Chat() {
			@Override
			void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
			
		};
	}
	
	class Chat{
		void start() {}
		void sendMessage(String message) {}
	}
}
