package sec06.stream_sorting;

public class Student implements Comparable<Student>{
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() { return name; }

	public int getScore() { return score; }

	@Override
	public int compareTo(Student o) {
		return Integer.compare(score, o.score);
		/* if(score < o.score) return -1; 
		   else if(score == o.score) return 0;
		   else return 1;
		 */ 
	}
}
