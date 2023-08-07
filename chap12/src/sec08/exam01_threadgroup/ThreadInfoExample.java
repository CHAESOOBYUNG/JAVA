package sec08.exam01_threadgroup;

import java.util.*;

public class ThreadInfoExample {
	public static void main(String[] args) {
		AutoSavedThread autoSavedThread = new AutoSavedThread();
		autoSavedThread.setName("AutoSavedThread"); // autoSavedThread 이름 지정
		autoSavedThread.setDaemon(true);
		autoSavedThread.start();
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces(); //스택에 있는 모든 스레드에 대해 정보 가져옴
		Set<Thread> threads = map.keySet();
		
		//Thread를 하나씩 가져와 루핑시킴
		for(Thread thread: threads) { 
			System.out.println("Name: "+ thread.getName() + ((thread.isDaemon())? "(데몬)":"(주)"));
			System.out.println("\t" + "소속그룹: " + thread.getThreadGroup().getName());
			System.out.println();
		}
		
	}
}
