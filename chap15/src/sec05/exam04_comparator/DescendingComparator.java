package sec05.exam04_comparator;

import java.util.*;

public class DescendingComparator implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) { //내림차순
		if(o1.price < o2.price) return 1; //가격이 적을 경우 뒤에 오게 함
		else if(o1.price == o2.price) return 0;
		else return -1; //가격이 클 경우 앞에 오게 함
	}


}
