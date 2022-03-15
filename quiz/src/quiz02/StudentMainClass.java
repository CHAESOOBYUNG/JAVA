package quiz02;

public class StudentMainClass {
 public static void main(String[] args) {
	Student myScore = new Student("채수병", 456, 100, 100, 100);
	Student myScore2 = new Student("박인욱", 1 , 0, 0, 0);

	int total1 = myScore.getTotal();
	double average1 = myScore.getAvg();
	int total2 = myScore2.getTotal();
	double average2 = myScore2.getAvg();

	System.out.println(myScore.name + "님의 총점은" + total1 + "점입니다.");
	System.out.println(myScore2.name + "님의 총점은" + total2 + "점입니다.");
	System.out.println(myScore.name + "님의 평균은" + average1 + "점입니다.");
	System.out.println(myScore2.name + "님의 평균은" + average2 + "점입니다.");

}
}
