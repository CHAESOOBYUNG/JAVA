package import_ex;



//패키지가 다른 클래스는 import선언이 필요.
//import fruit.Orange; 
//import fruit.Apple;
import fruit.*; //전부다

import java.util.Scanner;

import com.abc.ABC;
import com.def.DEF;

public class MainClass {

	public static void main(String[] args) {
		
		Orange o = new Orange();
		Apple a = new Apple();		
		
		ABC abc = new ABC();
		DEF def = new DEF();
		
		Scanner scan = new Scanner(System.in);
		
		int i = 1;
		System.out.println(i); //1
		System.out.println(o); //???
		System.out.println(a); //???
		
		
	}
}
