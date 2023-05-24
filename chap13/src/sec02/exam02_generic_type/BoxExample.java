package sec02.exam02_generic_type;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.set("오타니 쇼헤이");
		String player = box1.get();
		System.out.println(player);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(5);
		int value = box2.get();
		System.out.println(value);
	}
}
