package multithreading;

public class CreateThreadRunnableInterface  implements Runnable{

	

	@Override
	public void run() {
		
		System.out.println("mayuri");
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		CreateThreadRunnableInterface t=new CreateThreadRunnableInterface();
		Thread t1= new Thread(t);//create thread object
		//t1.setName("kamble");
		t1.start();
		t1.setName("kamble");
		//System.out.println(t1.isAlive());
		
		
		
	}

}
