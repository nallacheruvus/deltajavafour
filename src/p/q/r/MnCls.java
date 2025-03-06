package p.q.r;

public class MnCls {

	@SuppressWarnings("preview")
	public static void main(String[] args) {
		Runnable task=()->{
			System.out.println("Hai Iam Virtual Thread");
		};
		Thread hr=new Thread(task);
		hr.start();
//		Thread.startVirtualThread(task);
//		Runnable taska=()->{
//			for (int i = 1; i < 101; i++) {cmd
		
//				System.out.println("Sqrt("+i+")="+Math.sqrt(i));
//			}
//		};
//		Thread.ofVirtual().start(taska);
		
	}

}
