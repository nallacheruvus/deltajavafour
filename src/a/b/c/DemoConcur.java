package a.b.c;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class DemoConcur extends Thread {
	static CopyOnWriteArrayList<String> lis=new CopyOnWriteArrayList<String>();
	@Override
	public void run() {
		lis.add("Jungle Book");
	}
	
	public static void main(String[] args) throws InterruptedException {
		lis.add("Adventures of tom sawyer");
		lis.add("Adventures of huckleberry finn");
		lis.add("Godfather");
		lis.add("Fourth Estate");
		lis.add("Elephant song");
		DemoConcur demo=new DemoConcur();
		demo.start();
		Thread.sleep(5000);
		Iterator<String> itra=lis.iterator();
		while(itra.hasNext()) {
			System.out.println(itra.next());
			Thread.sleep(5000);
		}
		System.out.println(Arrays.toString(lis.toArray()));
	}
}