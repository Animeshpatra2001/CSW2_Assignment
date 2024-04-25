/*1. Create a generic class Pair<K,V> with private variables key and value. 
The class Pair should define a parameterised constructor and getter and 
setter methods for these attributes. After addition of objects, the main
class should retrieve and print the pair of key and value.*/
package genericsCollection;

public class Q01_Pair<K, V> {
	private K key;
	private V value;

	public Q01_Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public static void main(String[] args) {
		Q01_Pair<String, Integer> pair = new Q01_Pair<>("Example", 42);
		System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
	}

}
