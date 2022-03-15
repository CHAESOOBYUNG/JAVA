package poly.example;

public class MainClass {

	public static void main(String[] args) {
		//다형성장점 - 변수 1개로 여러타입을 저장
//      Vehicle v = new Bus(); //new Taxi();
//      v.ride();
		
		Bus b = new Bus();
		info(b); //info(new Bus() );
		
	    Vehicle v = info();
	    
	    
	    
		}
	
	    //메서드의 매개변수로 전달
	    public static void info(Vehicle b) {
	    	
	    	b.ride();
	    }
	    
	    //메서드의 변환유형으로 클래스반환
	    public static Vehicle info() {
	    	
	    	Vehicle v = new Taxi();
	    	
	    	return v;
	    }
	    
}
