package sec06.exam01_generic_wildcard;

public class Course<T> {
	private String name; //과정명
	private T[] students; //학생 배열(T type에 따라 종류 결정)
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[])(new Object[capacity]); // Object 타입을 T[]타입으로 변환 (수강가능 최대인원)
		//타입 파라미터로 배열을 생성하려면 new T[n] 형태로 배열을 생성할 수 없고 (T[]) (new Object[n])으로 생성해야 한다.
	}
	
	public String getName() { return name; }
	public T[] getStudents() { return students; }
	
	//배열에 비어있는 부분을 찾아서 수강생을 추가하는 메소드
	public void add(T t) { //T타입 객체 -> 비어있는 학생 배열에 삽입
		for(int i = 0; i < students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}
