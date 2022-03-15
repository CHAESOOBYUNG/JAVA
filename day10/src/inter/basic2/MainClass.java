package inter.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		Animal gamja = new Dog();
		Animal goguma = new Cat();
		Animal hodol = new Tiger();
		
		Animal[] ani = {gamja, goguma, hodol};
		
		for(Animal a : ani ) {
			a.eat();
		}
		
		
		System.out.println("--------------------------------------------");
		//1. IPet[]을 생성하고, gamja, goguma는 형변환 금붕어는 생성해서 저장합니다.
		//2. 향상된 for문으로 pet의 기능을 실행
		
		IPet[] pets = new IPet[3];
		pets[0] = (IPet)gamja;
		pets[1] = (IPet)goguma; //명시적형변환
		pets[2] = new GoldFish(); //자동형변환
		
		for(IPet p  : pets ) {
			p.play();
			p.sleep();
		}
		
		System.out.println("--------------------------------------------");
		
		PetHouse.carePet( pets[0] ); //gamja
		PetHouse.carePet( (IPet)goguma  ); //goguma
		PetHouse.carePet( new GoldFish() );
		
		PetHouse.petInfo(pets);
		
		
		
		
		
	}
}
