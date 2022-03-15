package encap.obj;

public class MainClass {

	public static void main(String[] args) {
		
		Hotel h = new Hotel();
		
		//getter의 사용
//		Employee e = h.getEmp();
//		e.working();
		h.getEmp().working();
		
		
		//setter의 사용
		//Chef c = new Chef();
		//h.setChef(c);
		h.setChef(new Chef());
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
