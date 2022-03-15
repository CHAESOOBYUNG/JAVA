package abs.good;

public class Store2 extends HeadStore {

	@Override
	public void apple() {
		System.out.println("부산지점 사과 500원");
	}

	@Override
	public void orange() {
		System.out.println("부산지점 오렌지 600원");
	}

	@Override
	public void grape() {
		System.out.println("부산지점 포도 700원");
	}

}
