package collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		
		//HashSet - 순서x, 중복 x (리스트와 반대)
		//HashSet<String> set = new HashSet<>();
		Set<String>set = new HashSet<>();
		
		//set에 추가 add() 
		set.add("java"); //순서x
		set.add("spring");
		set.add("db");
		set.add("oracle");
		set.add("js");
		set.add("js"); //중복x
		set.add("js");
		
		//set의 크기 size()
		System.out.println("set의 크기:" + set.size());
		
		System.out.println(set.toString());
		
		//값의 탐색 -> set의 저장된 값을 확인할 때 반복자(iterator)를 통해 확인 합니다.
		//iterator()
		
		Iterator<String> iter = set.iterator(); 
		
	    while(iter.hasNext()) { //다음에 존재여부 확인
	    	System.out.println(iter.next()); //다음에 대한 접근
	    }
		
        //set의 값 포함여부 contains
	    if(set.contains("js")) {
	    	System.out.println("js가 포함되어 있음");
	    }
		
	    //set의 삭제 remove(값)
	    set.remove("db");
	    System.out.println(set.toString());
	    
	    
	    System.out.println("-------------------------------------");
	    //list에 set 합쳐 사용하기
	    List<String> list = new ArrayList<>();
	    list.addAll(set);
	    System.out.println("리스트의 요소:" + list.toString());
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
}
