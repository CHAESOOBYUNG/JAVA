package quiz14;

public class Marine extends Unit {
	
	//1. 모든 마린의 공격력과 방어력은 동일합니다! 알맞은 키워드를 넣어주세요
	public static int attack = 6;
	public static int armor = 0;
	
	//2. 마린은 생성될떄 x=0, y=0, hp=60으로 초기화 하세요
	public Marine() {
		super(0, 0, 60);
	}
	
	/* 3
	 * steampack()은 마린의 attack을 12로 변경하는 메서드
	 */
	public static int steampack() {
		attack = 12;
		return attack;
	}
	
	
	/* 4
	 * location()의 기능
	 * 마린의 현재위치 x, y의 출력
	 */
	public void location() {
		System.out.println("x:" + this.getX() + ", y:" +this.getY());
	}
	
	

	/* 5
	 * move()의 기능
	 * 1. 현재좌표값에서 매개변수의 좌표만큼 이동한 거리를 구한다
	 *    루트 근사값은 Math.sqrt(제곱근)을 이용하면 됩니다
	 *    
	 * 2. 현재 좌표값을 매개변수의 좌표값으로 변경
	 * 3. 이동한 거리를 정수형으로 출력
	 * 
	 */
	public void move(int x, int y) {
		
		int distance = (this.getX() - x)*(this.getX() - x) + (this.getX() - y) * (this.getX() - y);
		//좌표변경
		setX(x);
		setY(y);
		
		System.out.println("이동거리:" +  (int)Math.sqrt(distance) );
		
	}

	
	
	
	
	
	
}
