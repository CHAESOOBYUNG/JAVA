package quiz23;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RamdaQuiz01 {

	public static void main(String[] args) {
		/*
		 * 대용량 컬렉션처리에 유리한 장점을 가집니다.
		 * 
		 * 1. BufferedReader클래스 사용해서 해당파일을 읽어주세요.
		 * 2. , 기준으로 split(",", 맥스크기) 이용해서 Data클래스에 한줄 단위로 저장.
		 * 3. 리스트에 Data객체를 저장하면,
		 *    리스트 크기가 4505개.
		 * 
		 * 4. 람다식을 이용해서,
		 * 조건) 지역: 서울, 1~4월, 분양가격 4000이상의 데이터만 추출해서
		 * 새로운 리스트에 저장.
		 */
		List<Data> list = new ArrayList<>();
		
		String path = "C:\\Users\\Chae Soobyung\\Documents\\카카오톡 받은 파일\\주택도시보증공사_전국 평균 분양가격(2020년 2월).csv";
		BufferedReader br = null;
	
		try {
			//br = new BufferedReader( new FileReader(""));
			br = new BufferedReader( new InputStreamReader( new FileInputStream(path), "EUC-KR"));
			
			String str;
			while((str = br.readLine()) != null) {
				//System.out.println(str);
				String[] arr = str.split(",", 5); //,기준으로 잘라서 담는다
				System.out.println(Arrays.toString(arr));
				
				
				
				Data data = new Data(arr[0], 
						             arr[1], 
						             arr[2], 
						             arr[3], 
						             arr[4].equals("") ? "0" : arr[4]);
				
				list.add(data);
			} //end while
			
			//
			List<Data> result = list.stream()
			                        .filter( (data) -> data.getRegion().equals("서울") )
			                        .filter( (data) -> Integer.parseInt(data.getMonth()) >= 1 && Integer.parseInt(data.getMonth()) <= 4 ) 
			                        .filter( (data) -> Integer.parseInt(data.getPrice()) >= 4000 )
			                        .collect( Collectors.toList());
			
			//결과
			result.stream().forEach( (a) -> System.out.println(a.toString()));
			
			System.out.println(result.size());
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
			
			}
		}
		
	}
}
