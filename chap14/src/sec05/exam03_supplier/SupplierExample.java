package sec05.exam03_supplier;

import java.util.function.*;

public class SupplierExample {
	public static void main(String[] args) {
		//람다식
		IntSupplier intSupplier = () -> { //리턴값 공급
			int num = (int)(Math.random()*6) + 1;
			return num;
		};
		
		int num = intSupplier.getAsInt();
		System.out.println("주사위 눈의 수: "+ num);
	}
}
