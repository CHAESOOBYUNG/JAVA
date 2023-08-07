package sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87};
		
		int sum1 = 0;
		for(int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합: " + sum1);
		
		int sum2 = add(new int[] {83, 90, 87}); //리턴된 총합을 sum2에 저장
		
		System.out.println("총합2: " + sum2);
		
	}
	
	//총합을 계산해서 리턴하는 메소드
	public static int add(int[] scores) {
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		return sum;
	}
	
}
