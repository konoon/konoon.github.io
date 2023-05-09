package source15.generic;

public class Test02<K, V> {
	private K key;
	private V value;
	
	public Test02(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
	
}
