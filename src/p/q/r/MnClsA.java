package p.q.r;

import java.util.Arrays;
import java.util.Collections;
import java.util.SplittableRandom;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class MnClsA {
	public static void main(String[] args) throws Exception {
		Supplier<Double> rVal=()->Math.floor((new SplittableRandom()).nextDouble(0,20));
		System.out.println(rVal.get());
		Supplier<Double> rVala=()->Math.random();
		System.out.println(rVala.get());
		Callable<Integer> calle=new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				return 1009;
			}
		};
		System.out.println(calle.call());
		MyThr myth=new MyThr();
		myth.setMyVal(200);
		myth.start();
		Integer[] arr= {222,1,33,12,17};
		Collections.sort(Arrays.asList(arr));
		System.out.println(Arrays.asList(arr));
	}
}