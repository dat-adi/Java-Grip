import java.util.*;
import java.util.stream.*;

class EthCode {
	public static Map<Integer, String>
			convertToTreeMap(Map<String, String> hashMap)
	{
		Map<Integer, String> treeMap = new TreeMap<>();
		for (Map.Entry<String, String> e : hashMap.entrySet()) {
			treeMap.put(Integer.parseInt(e.getKey()), e.getValue());
		}
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

		Map<Integer, String> treeMap = convertToTreeMap(hashMap);

		System.out.println("TreeMap: " + treeMap);
	}
}
