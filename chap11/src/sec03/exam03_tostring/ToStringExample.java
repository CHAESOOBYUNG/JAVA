package sec03.exam03_tostring;

import java.util.*;

public class ToStringExample {
	
	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		System.out.println(obj1);
		/* 위의 출력문과 같음
		 * System.out.println(obj1.toString()); */
		System.out.println(obj2.toString());
	}
	
}
