package sec03.exam02_hashcode;

public class Key {	
	public int number;
	public Key(int number) {
		this.number = number;
	}
	
	//equals() 메소드 재정의 -> ctrl + space -> equals(Object obj) 클릭
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()");
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
	//hashCode() 메소드 재정의 -> ctrl + space -> hashCode() 클릭
		@Override
		public int hashCode() {
			System.out.println("hashCode()");
			return number;
		}
}
