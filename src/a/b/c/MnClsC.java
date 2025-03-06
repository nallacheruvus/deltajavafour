package a.b.c;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class MnClsC {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//LTS=Long time support
		CompletableFuture<String> myFuture=
				CompletableFuture.supplyAsync(()->(new StringBuilder("Satish")).reverse().toString());
		System.out.println(myFuture.get());
		CompletableFuture<String> aFuture=CompletableFuture.supplyAsync(()->{
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "Hammunaputra";
		});
		CompletableFuture<String> bFuture=CompletableFuture.supplyAsync(()->"Cleopatra");
		CompletableFuture<String> combFuture=aFuture.thenCombine(bFuture, (m1,m2)->m1+" "+m2);
		System.out.println(combFuture.get());
		CompletableFuture<Integer> resFuture=CompletableFuture.supplyAsync(()->10/0).exceptionally(ex->0);
		System.out.println(resFuture.get());
	}
}
