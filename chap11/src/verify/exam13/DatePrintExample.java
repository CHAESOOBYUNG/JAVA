package verify.exam13;

import java.text.*;
import java.time.*;
import java.util.*;

public class DatePrintExample {
	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
		System.out.println(sdf.format(now));
				
	}
}
