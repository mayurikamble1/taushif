package methodinmultitreading;
//jvm  provide to each thread according to priority
//as per allocate the processor
//range bet 1 to10 not bet througth IlligalAgrument Exception 
//1 MIN PRIORITY
// 5 PRIORITY
//10 MAX PRIORITY/
//setPriority(number),get priority()
//by default main thread priority 5
//priority depends on platform
public class PriorityMethod  extends Thread{
	
	
	@Override
	public void run() {
		System.out.println("mayuri");
		System.out.println(Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		System.out.println();
		PriorityMethod  pm = new PriorityMethod();
		pm.setPriority(4);
		pm.start();
	}
	

}
