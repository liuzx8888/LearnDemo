package enumdemo;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public enum EnueMapDemo {
	/* 🏀,⚽,🏓; */
	篮球, 足球, 乒乓球;
	public static void main(String[] args) {
		Map<EnueMapDemo, String> mapboll = new EnumMap<EnueMapDemo, String>(EnueMapDemo.class);

		mapboll.put(篮球, "🏀");
		mapboll.put(足球, "⚽");
		mapboll.put(乒乓球, "🏓");

		Set<Map.Entry<EnueMapDemo, String>> entries = mapboll.entrySet();
		Iterator<Map.Entry<EnueMapDemo, String>> iterator = entries.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		for(EnueMapDemo c: mapboll.keySet()) {
			System.out.println(c.name());
		}
		
		for(String d: mapboll.values()) {
			System.out.println(d);
		}	
		

		

	}
}
