package sec121_structure;

public class No2_C_question {
	/* 구조체 - C언어 기본타입을 통해 새롭게 정의 가능 -> 사용자 정의 타입
	 * #include <stdio.h>
	 * struct jsu {
	 * 	 char nae[12];
	 * 	 int os, db, hab, hhab;
	 * };
	 * 
	 * int main() {
	 * 	   struct jsu st[3] = { {"데이터1", 95, 88},
	 * 							{"데이터2", 84, 91},
	 * 							{"데이터3", 86, 75} };
	 * 	   struct jsu* p;
	 * 	   p = &st[0];
	 * 	   (p + 1) -> hab = (p + 1) -> os + (p + 2) -> db;
	 * 	   (p + 1) -> hhab = (p + 1) -> hab + p -> os + p -> db;
	 * 		printf("%d", (p + 1) -> hab + (p + 1) -> hhab);
	 * }
	 * 
	 * 결과값 - 501
	 */
}
