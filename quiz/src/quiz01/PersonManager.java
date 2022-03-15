package quiz01;

import java.util.Scanner;

public class PersonManager {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] nameList = new String[100];
		String[] genderList = new String[100];
		int[] ageList = new int[100];
		
		int count = 0; //사람 수
		int index = -1; //현재 접근하고 있는 위치 (인덱스를 조정해서 유저의 정보를 출력)
		
		es:while(true) {
			System.out.println("[info]고객수:" + count + ", 현재위치:" + index);
			System.out.println("[menu]1.Insert, 2.Prev, 3.Next, 4.Current, 5.Update, 6.Delete, 7.Exit");
			
			System.out.print("메뉴입력(번호로입력)>");
			int menu = scan.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("==========고객정보입력==========");
				/*
				 * 이름, 성별, 나이를 입력받아서 각각 배열에 순서대로 저장. (count)를 이용
				 */
				System.out.print("이름>");
				String name = scan.next();
				System.out.print("성별>");
				String gender = scan.next();
				System.out.print("나이>");
				int age = scan.nextInt();
				
				nameList[count] = name;
				genderList[count] = gender;
				ageList[count] = age;
				count++; //사람수 증가
				
				System.out.println("=============================");
				break;
			case 2:
				System.out.println("==========이전고객정보==========");
				/*
				 * index를 이용해서 이전고객정보를 출력해주는 기능.
				 * 조건식을 사용해서 이전 범위를 출력할수 없다면 "이전정보가 없습니다" 경고문을 출력.
				 */
				if(index <= 0) {
					System.out.println("이전 정보가 없습니다");
				} else {
					index--;
					System.out.println("이름:" + nameList[index]);
					System.out.println("성별:" + genderList[index]);
					System.out.println("나이:" + ageList[index]);
					
				}
				
				
				
				
				System.out.println("=============================");
				break;
			case 3:
				System.out.println("==========다음고객정보==========");
				/*
				 * index를 이용해서 다음 고객 정보를 출력해주는 기능.
				 * count와 index를 비교해서, 다음 범위를 출력할수 없다면 "다음정보는 없습니다" 경고문 출력.
				 * 
				 */
				if(index >= count - 1) { //다음이 없는경우
					System.out.println("다음 정보는 없습니다");
				} else {
					index++;
					System.out.println(nameList[index]);
					System.out.println(genderList[index]);
					System.out.println(ageList[index]);
				}
				
				
				
				
				System.out.println("=============================");
				break;
			case 4:
				/*
				 * index이용해서 현재 고객 정보를 출력해주는 기능.
				 * 현재정보를 출력할 수 있는 범위를 생각해서  현재정보를 출력합니다.
				 * index가 벗어났다면, "현재정보는 없습니다" 출력.
				 * 
				 * 힌트)
				 * index >= 0 && index <=count -1 
				 */
				if(index >= 0 && index <= count - 1) { //출력이 가능한조건
					System.out.println("이름:" + nameList[index]);
					System.out.println("성별:" + genderList[index]);
					System.out.println("나이:" + ageList[index]);
					
				} else {
					System.out.println("현재 정보는 없습니다(위치를 확인하세요)");
				}
				
				
				
				break;
			case 5:
				System.out.println("=========고객정보수정==========");
				/*
				 * 스캐너를 이용해서, 이름,성별,나이를 입력받아 현재 위치정보를 업데이트.
				 * 출력가능한 조건 범위는 4번 같습니다.
				 */
				if(index >= 0 && index <= count - 1) {
					//수정
					System.out.println("정보를 수정합니다>");
					
					System.out.println("현재이름:" + nameList[index]);
					nameList[index] = scan.next();
					System.out.println("현재성별:" + genderList[index]);
					genderList[index] = scan.next();
					System.out.println("현재나이:" + ageList[index]);
					ageList[index] = scan.nextInt();
					
				} else {
					System.out.println("수정할 데이터가 없습니다.");
				}
				
				
				System.out.println("=============================");
				break;
			case 6:
				System.out.println("=========고객정보삭제===========");
				/*
				 * 삭제가능 조건은 4번과 같습니다.
				 * 현재 index부터 ~~count인덱스까지 배열의 요소를 당겨서 덮어 씌웁니다.
				 * 고객수의 감소
				 */
				if(index >= 0 && index <= count - 1) {
					
					for(int i = index; i < count - 1; i++) {
						nameList[i] = nameList[i+1];
						genderList[i] = genderList[i+1];
						ageList[i] = ageList[i+1];
					}
					count--; //사람수 감소
					
				} else {
					System.out.println("삭제할 정보가 없습니다");
				}
				
				System.out.println("=============================");
				break;
			case 7:
				//무한반복문의 탈출.
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
				//break es;
			default:
				//메뉴를 잘못입력한 경우.
				System.out.println("[1~7]메뉴를 숫자로입력하세요.");
				break;
			}
			
			
			
		}
		
		
	}
}
