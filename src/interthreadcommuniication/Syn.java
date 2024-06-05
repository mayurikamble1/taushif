package interthreadcommuniication;

public class Syn {
	void Syn() {
		for(int i=0; i<4; i++) {
			System.out.println(i);
		}
	}
	class Test extends Thread{

		@Override
		public void run() {
			Syn();
		}
		
	}
	public static void main(String[] args) {
		Syn s= new Syn();
		 
		 
		
	}

}
