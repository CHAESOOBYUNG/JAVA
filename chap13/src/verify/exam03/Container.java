package verify.exam03;

public class Container<K, V> {
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	public void set(K k, V v) {
		this.key = k;
		this.value = v;
	}
	public V getValue() {
		return value;
	}
}
