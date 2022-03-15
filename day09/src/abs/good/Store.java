package abs.good;

public class Store extends HeadStore {

	@Override
	public void apple() {
		System.out.println("서울 지점 사과는 300원");
	}

	@Override
	public void orange() {
		System.out.println("서울 지점 오렌지는 400원");
	}

	@Override
	public void grape() {
		System.out.println("서울 지점 포도는 500원");
	}

	
}
