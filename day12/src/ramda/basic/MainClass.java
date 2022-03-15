package ramda.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.greeting(new Say01() {
			@Override
			public void talking() {
				//System.out.println("bye~");
				System.out.println("니하오");
			}
		});

		p.greeting(new Say02() {
			@Override
			public String talking() {
				return "hello";
			}
		});
		
		p.greeting(new Say03() {
			
			@Override
			public String talking(String word) {
				return "(듕국말)" + word ;
			}
		} );
		
		String result = p.greeting(new Say04() {
			@Override
			public String talking(int a, String word) {
				
				String result = "";
				for(int i = 1; i <= a; i++) {
					result += word;
				}
				return result;
			}
		});
		
		System.out.println("최종결과:" + result);
		
		
		
		
		System.out.println("--------------------------");
		//함수적인터페이스에 익명객체를 대신해서 람다식을 사용할 수 있습니다.
		//구현메서드의 매개변수 () 로 표현되고 몸체가 { }로 표현됩니다
		
		//say01
		//실행문이 하나라면 중괄호 생략가능.
		p.greeting( () -> System.out.println("안녕하세요")  );
		
		
		//say02
		p.greeting( () -> {  
			return "hello"; 
		});
		
		//say03
		p.greeting( (word) -> {
			return "(람다의듕국말)" + word;
		});
		
		//say04
		//람다식 안에서는 static변수만 예외적으로 참조할수 있습니다.
		String result2 = p.greeting( (a, word) -> {

			String str = "";
			for(int i = 1; i <= a; i++) {
				str += word;
			}
			return str;
		});
		
		System.out.println("최종결과:" + result2);		
		
		
		
		
		
	}
}
