package sec02.exam01_byte;

public class GarbageValueExample {
	public static void main(String[] args) {
		
		byte var1 = 125;
		
/*		var1++;
		System.out.println(var1); //126
		
		var1++;
		System.out.println(var1); //127
		
		var1++;
		System.out.println(var1); // 값을 순회해서 최솟값인 -128로 이동
*/
		int var2 = 125;
		
		for(int i = 0; i < 5; i++) {
			var1++;
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2); 
			// "\t"는 tab만큼 칸을 띄어주는 역할을 함
		} // for문으로 5번 반복 실행
	}
}
