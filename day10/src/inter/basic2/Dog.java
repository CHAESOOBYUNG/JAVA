package inter.basic2;

public class Dog extends Animal implements IPet {

	@Override
	public void eat() {
		System.out.println("강아지는 사료를 먹습니다");
	}

	@Override
	public void play() {
		System.out.println("강아지는 밖에서 놀아요");
	}

	@Override
	public void sleep() {
		System.out.println("강아지도 집에서 잠을자요");
	}

}
