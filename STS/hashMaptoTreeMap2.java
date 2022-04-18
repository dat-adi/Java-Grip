import java.util.*;
import java.util.stream.*;

class EthCode {
	// Generic function
	public static <K, V> Map<K, V> convertToTreeMap(Map<K, V> hashMap)
	{
		Map<K, V>
			treeMap = hashMap
						// Get the entries from the hashMap
						.entrySet()

						// Convert the map into stream
						.stream()

						// Now collect the returned TreeMap
						.collect(
							Collectors

								// Using Collectors, collect the entries
								// and convert it into TreeMap
								.toMap(
									Map.Entry::getKey,
									Map.Entry::getValue,
									(oldValue,
									newValue)
										-> newValue,
									TreeMap::new));

		// Return the TreeMap
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
