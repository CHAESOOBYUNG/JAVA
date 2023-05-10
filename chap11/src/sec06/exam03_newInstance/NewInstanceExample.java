package sec06.exam03_newInstance;

public class NewInstanceExample {
	// 동적 객체 생성(newInstance())
	public static void main(String[] args) {
			try {
				Class class1 = Class.forName("sec06.exam03_newInstance.SendAction"); // Surround with try/catch
				Action action = (Action) class1.newInstance(); // Add catch clause to surrounding try
				action.execute();
			} catch (ClassNotFoundException e) { //forName() exception
				e.printStackTrace();
			} catch (InstantiationException e) { //newInstance() exception
				e.printStackTrace();
			} catch (IllegalAccessException e) { //newInstance() exception
				e.printStackTrace();
			} /* catch (Exception e) {
				e.printStackTrace(); 
			} */		
			
			try {
				Class class2 = Class.forName("sec06.exam03_newInstance.ReceiveAction");
				Action action2 = (Action) class2.newInstance(); 
				action2.execute();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	}
}
