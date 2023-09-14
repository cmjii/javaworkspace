package day_21;

class MyThread2 implements Runnable{

	//반드시 run구현
	@Override
	public void run() {
		for(int i =0; i<500; i++) {
			System.out.println(i+"번째"+Thread.currentThread().getName());
		}
		
	}
	
}


public class Thread02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Runnable를 구현하는 방법
		 * 직접 객체 생성만으로 실행 불가능
		 * Thread 클래스의 생성자로 runnable 구현 객체를 추가
		 * */
		
		MyThread2 mth = new MyThread2();
		Thread th = new Thread(mth);
		th.start();
		
		try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread th2 = new Thread(new MyThread2());
		th2.start();
		


		
		System.out.println("main end");
		
	}

}
