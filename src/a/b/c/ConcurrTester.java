package a.b.c;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrTester {
	public static void main(String[] args) {
		ConcurrentNavigableMap csMap=new ConcurrentSkipListMap();
		String[] arr1= {"One","Two","Three","Four","Five"};
		String[] arr2= {"Skoda","Punto","Lilac","Lincoln","Empala"};
		for (int i = 0; i < arr2.length; i++) {
			csMap.put(arr1[i], arr2[i]);
		}
//		System.out.println(csMap.ceilingEntry("Four"));
		System.out.println("*".repeat(50));
//		csMap.navigableKeySet().stream().forEach(n->System.out.println(n+" "+csMap.get(n)));
//		csMap.entrySet().stream().forEach(n->System.out.println(n.toString()));
//		csMap.entrySet().parallelStream().forEach(n->System.out.println(n));
//		csMap.entrySet().iterator().forEachRemaining(n->System.out.println(n));
		int i=0;
		while(i<5) {
			System.out.println(csMap.pollFirstEntry());
			i++;
		}
		System.out.println(csMap.size());
		
	}

	private static void methA(ConcurrentNavigableMap csMap) {
		NavigableSet<String> nvSet=csMap.descendingKeySet();
		Iterator<String> itra=nvSet.descendingIterator();
		while(itra.hasNext()) {
			String myKey=itra.next();
			System.out.println(myKey+" "+csMap.get(myKey));
		}
		csMap.put("Six", "Thar");
		System.out.println("*".repeat(50));
		System.out.println(csMap.firstEntry());
		System.out.println("*".repeat(50));
		System.out.println(csMap.lastEntry());
		System.out.println("*".repeat(50));
//		System.out.println(csMap.pollFirstEntry());
		System.out.println("*".repeat(50));
//		System.out.println(csMap.pollLastEntry());
	}
}
