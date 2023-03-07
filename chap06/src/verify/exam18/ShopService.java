package verify.exam18;

public class ShopService {
	private static ShopService singleton = new ShopService();
	
	private ShopService() {
		
	}
	
	public static ShopService getInstance() {
		return singleton;
	} //싱글톤 생성
}
