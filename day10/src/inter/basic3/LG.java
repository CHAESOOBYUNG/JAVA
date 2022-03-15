package inter.basic3;

public class LG implements Printed {
	
	private String logo = "Life is good";
	
	@Override
	public void turnOn() {
		System.out.println(logo);
		System.out.println("켜다");
	}

	@Override
	public void turnOff() {
		System.out.println(logo);
		System.out.println("끄다");
	}

	@Override
	public void print(String document) {
		System.out.println(logo);
		System.out.println(document);
	}

	@Override
	public void colorPrint(String document, String color) {
		System.out.println(logo);
		System.out.println(color + "색 출력:" + document);
	}

	@Override
	public int copy(int n) {
		System.out.println(logo);
		System.out.println(n + "장 출력시행");
		return n;
	}

}
