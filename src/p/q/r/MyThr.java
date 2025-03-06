package p.q.r;

public class MyThr extends Thread {
	private int myVal;
	@Override
	public void start() {
		for (int i = 1; i < this.myVal; i++) {
			System.out.println("Sqrt("+i+")="+Math.sqrt(i));
		}
	}
	public int getMyVal() {
		return myVal;
	}
	public void setMyVal(int myVal) {
		this.myVal = myVal;
	}
}