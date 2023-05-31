package sec06.exam01_generic_wildcard;

import java.util.*;

public class WildCardExample {
	public static void registerCourse(Course<?> course) { //모든 클래스 허용
		System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) { //Student 클래스 상위 클래스 제한
		System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) { //Worker 클래스 하위 클래스 제한
		System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		//일반인 과정
		Course<Person> personCourse = new Course<Person>("일반인 과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		//직장인 과정
		Course<Worker> workerCourse = new Course<Worker>("직장인 과정", 5);
		workerCourse.add(new Worker("직장인"));
		
		//학생 과정
		Course<Student> studentCourse = new Course<Student>("학생 과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		
		//고등학생 과정
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생 과정", 5);
		highStudentCourse.add(new HighStudent("고등학생"));
		
		//과정 등록
		//모든 과정 등록 가능
		registerCourse(personCourse); //registerCourse( new Course<Person>("일반인 과정", 5) );
		registerCourse(workerCourse); //registerCourse( new Course<Worker>("직장인 과정", 5));
		registerCourse(studentCourse); //registerCourse( new Course<Student>("학생 과정", 5) );
		registerCourse(highStudentCourse); //registerCourse( new Course<HighStudent>("고등학생 과정", 5) );
		System.out.println();
		
		//학생 과정만 등록 가능
		//registerCourseStudent(personCourse); //registerCourseStudent( new Course<Person>("일반인 과정", 5) ); //상위 클래스 사용 불가(에러)
		//registerCourseStudent(workerCourse); //registerCourseStudent( new Course<Worker>("직장인 과정", 5)); //Student 클래스 상속 X(에러)
		registerCourseStudent(studentCourse); //registerCourseStudent( new Course<Student>("학생 과정", 5) );
		registerCourseStudent(highStudentCourse);//registerCourseStudent( new Course<HighStudent>("고등학생 과정", 5) );
		System.out.println();
		
		//직장인, 일반인 과정만 등록 가능
		registerCourseWorker(personCourse); //registerCourseWorker( new Course<Person>("일반인 과정", 5) );
		registerCourseWorker(workerCourse);//registerCourseWorker( new Course<Worker>("직장인 과정", 5));
		//registerCourseWorker(studentCourse);//registerCourseWorker( new Course<Student>("학생 과정", 5) ); //Worker 클래스 상속 X (에러)
		//registerCourseWorker(highStudentCourse);//registerCourseWorker( new Course<HighStudent>("고등학생 과정", 5) ); //Student 클래스 하위 클래스
	}
}
