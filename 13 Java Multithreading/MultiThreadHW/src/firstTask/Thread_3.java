package firstTask;

public class Thread_3 extends Thread{
	public void run() {
		System.out.println("The thread is started!"+getName());
		System.out.println("My name is "+getName());
		try {
			Thread.sleep(4000);
			System.out.printf("�he thread complete!(%s)%n",getName());
		} catch (InterruptedException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
