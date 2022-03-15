package quiz09;

public class MyCart extends Cart {
	//1. Cart를 상속받아 필요한 메서드를 재정의 합니다.
	//1. Cart에는 불필요한 변수를 정의하지 않습니다.
	//2. MyCart의 생성자에서는 int매개변수를 하나 받으며, 금액만 초기화합니다. tv=300원, com=400원, radio=500원 으로 초기화
	public MyCart(int money) {
		this.money = money;
		this.tv = 300;
		this.com = 400;
		this.radio = 500;
	}
	
	
	//3. buy(), add() 메서드를 오버라이딩 합니다.
	
	/*
	 * buy()의 기능
	 * 1. money가 300보다 작으면 "금액부족" 출력후 메서드를 종료.
	 *    매개변수가 tv, com, radio가 아니더라도 "상품없음" 출력 후 종료
	 * 2. 매개변수 tv라면 금액에서 tv가격을 빼고 add(상품)을 호출
	 *    매개변수 com라면 금액에서 com가격을 빼고 add(상품)를 호출
	 *    매개변수 radio라면 금액에서 radio를 빼고 add(상품)을 호출
	 */
	public void buy(String product) {
		if(money < 300) {
			System.out.println("금액부족");
			return;
		} else if( !(product.equals("tv") || product.equals("com") || product.equals("radio")) ) {
			System.out.println("상품없음");
			return;
		}
		
		switch (product) {
		case "tv":
			money -= tv;
			break;
		case "com":
			money -= com;
			break;
		case "radio":
			money -= radio;
			break;
		default:
			break;
		}
		
		this.add(product);
	}
	/*
	 * add()의 기능
	 * 1. 만약 i의 값이 장바구니의 크기보다 같거나 크다면
	 *    -기존의 장바구니보다 크기가 * 2큰 배열을 생성.
	 *    -기존의 장바구니 값을 새로운 배열에 복사.
	 *    -새로운 장바구니를 기존의 장바구니와 바꾼다.
	 * 2. product를 장구니에 담는다.
	 * 3. info() 메서드를 호출
	 */
	public void add(String product) {
		
		if(i >= cart.length ) { //가득찬경우
			String[] newCart = new String[cart.length * 2 ];
			
			for(int j = 0; j < cart.length; j++) { //기존카트의 크기
				newCart[j] = cart[j];
			}
			
			cart = newCart; 
		}//end if
		
		cart[i] = product; //담는다
		i++;
		
		//호출
		info();
	}
	
	
}
