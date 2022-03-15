package generic.multi;

public class Basic<K, V> {

	//멀티제네릭
	private K key;
	private V value;
	
	//메서드
	public void put(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public V get(K key) {
		return value;
	}
	//toString
	@Override
	public String toString() {
		
		return "Basic [key=" + key + ", value=" + value + "]";
	}
	
	
	
}
