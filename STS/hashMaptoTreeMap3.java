import com.google.common.collect.*;
import java.util.*;
import java.util.stream.*;

class EthCode {

	public static <K extends Comparable, V> Map<K, V>
					convertToTreeMap(Map<K, V> hashMap)
	{
		Map<K, V> treeMap = Maps.newTreeMap();
		treeMap.putAll(hashMap);
		return treeMap;
	}

	public static void main(String args[])
	{
		Map<String, String> hashMap = new HashMap<>();

		hashMap.put("1", "A");
		hashMap.put("2", "B");
		hashMap.put("3", "W");
    hashMap.put("4", "X");
    hashMap.put("6", "Y");
    hashMap.put("7", "Z");

		System.out.println("HashMap: " + hashMap);

		// construct a new TreeMap from HashMap
		Map<String, String> treeMap = convertToTreeMap(hashMap);

		System.out.println("TreeMap: " + treeMap);
	}
}
