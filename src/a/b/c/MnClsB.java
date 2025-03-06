package a.b.c;

import java.util.ArrayList;
import java.util.List;

public class MnClsB {

	public static void main(String[] args) {
		List lia = new ArrayList();
		lia.add(1l);
		lia.add(2l);
		lia.add(3l);
		lia.add(4l);
		System.out.println(myAddition((ArrayList<? extends Number>) lia));
	}

	/**
	 * Bounded Generic method call
	 * @param a
	 * @return
	 */
	public static Double myAddition(ArrayList<? extends Number> a) {
		double sum = 0.0;
		for (Number n : a) {
			sum += n.doubleValue();
		}
		return sum;
	}
}
