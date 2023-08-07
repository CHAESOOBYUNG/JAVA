package sec06.exam01_stack;

import java.util.*;

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		//동전을 끼움
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) { //동전케이스가 비었는지 확인
			Coin coin = coinBox.pop(); //스택 맨위 객체 가져옴(객체는 스택에서 제거) (동전케이스에서 제일 위의 동전 꺼내기)
			System.out.println("꺼내온 동전: " + coin.getValue() + "원");
		}
	}
}
