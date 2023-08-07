package sec02.exam02_thread_name;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread(); //이 코드를 실행하는 스레드 객체 얻기
		System.out.println("프로그램 시작 스레드 이름: " + thread.getName()); //getName() - 스레드 이름 얻기
		
		Thread threadA = new ThreadA(); //ThreadA 생성
		System.out.println("Thread-A를 생성한 스레드: " + thread.currentThread().getName()); //getName() - 스레드 이름 얻기
		System.out.println("작업 스레드 이름: " + threadA.getName());
		threadA.start(); //ThreadA 시작
		
		Thread threadB = new ThreadB(); //ThreadB 생성
		System.out.println("Thread-B를 생성한 스레드: " + thread.currentThread().getName()); //getName() - 스레드 이름 얻기
		System.out.println("작업 스레드 이름: " + threadB.getName()); //getName() - 스레드 이름 얻기
		threadB.start(); //ThreadB 시작
	}
}
