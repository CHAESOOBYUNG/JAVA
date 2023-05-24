package sec04.exam02_generic_method;

public class Util {
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean KeyCompare = p1.getKey().equals(p2.getKey());
		boolean ValueCompare = p1.getValue().equals(p2.getValue());
		return KeyCompare && ValueCompare; // 둘 다 참이면 true 리턴 / 둘 중 하나라도 거짓이면 false 리턴
	}
}
