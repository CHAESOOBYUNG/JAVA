package sec04.exam02_synchronized;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) { //객체 1개만 사용 가능
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (Exception e) {}
		
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
	
	
}
