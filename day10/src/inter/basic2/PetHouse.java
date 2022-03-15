package inter.basic2;

public class PetHouse {

	/*
	 *1. carePet() 메서드를 선언
	 *매개변수로 모든 펫타입을 받을 수 있도록 선언
	 *기능-instanceof를 사용해서 클래스 캐스팅하여, 타입확인 
	 */
	public static void carePet(IPet pet) {
		
		if(pet instanceof Dog) {
			Dog d = (Dog)pet;
			System.out.println("dog");
		
		} else if(pet instanceof Cat) {
			Cat c = (Cat)pet;
			System.out.println("cat");
			
		} else if(pet instanceof GoldFish) {
			GoldFish g = (GoldFish)pet;
			System.out.println("goldfish");
		}
		
	}
	/*
	 * 2. petInfo() 메서드 선언
	 * 매개변수로 IPet[]을 받을 수 있도록 선언
	 * 기능 - 펫배열을 회전시켜 play(), sleep()기능을 실행.
	 */
	public static void petInfo(IPet[] pet ) {
		
		for(IPet p : pet) {
			p.play();
			p.sleep();
		}
		
	}
	
	
	
}
