package verify.exam10;

public class Student implements Comparable<Student>{
	public String id;
	public int score;
	
	public Student(String id, int score) {
		this.id = id;
		this.score = score;
	}
	
	@Override
	public int compareTo(Student o) { //오름차순
		if(o.score < score) return 1;
		else if (o.score == score) return 0;
		else return -1;
	}
}
