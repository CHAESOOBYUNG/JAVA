package sec08.exam01_threadgroup;

public class ThreadGroupExample {
	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("myGroup"); //'main' 그룹 밑에 'myGroup' 그룹 생성됨
		
		//'myGroup' 그룹 밑에 'workThreadA' 그룹, 'workThreadB' 그룹 포함시키기
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[ main 스레드 그룹의 list() 메소드 출력 내용 ]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup(); //main스레드가 포함된 스레드 그룹 얻음
		mainGroup.list(); //mainGroup의 상황을 출력
		System.out.println();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		System.out.println("[ myGroup 스레드 그룹의 interrupt() 메소드 호출 ]");
		myGroup.interrupt();
	}
	
	/* 결과값 해석 
	  	[ main 스레드 그룹의 list() 메소드 출력 내용 ]
		java.lang.ThreadGroup[name=main,maxpri=10] //스레드그룹[스레드그룹 이름, 최대 우선순위]
		    Thread[main,5,main] //스레드[스레드이름, 우선순위, 소속 그룹명] -> 스레드그룹에 포함됨
		    java.lang.ThreadGroup[name=myGroup,maxpri=10] //서브그룹[서브그룹 이름, 최대 우선순위]
		        Thread[workThreadA,5,myGroup]
		        Thread[workThreadB,5,myGroup]
		
		[ myGroup 스레드 그룹의 interrupt() 메소드 호출 ]
		workThreadAinterrupted()
		workThreadA종료됨
		workThreadBinterrupted()
		workThreadB종료됨 */
}
