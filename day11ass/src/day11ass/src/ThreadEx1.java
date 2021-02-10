package day11ass.src;
public class ThreadEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread t=new Thread(()->{
	for(int i=1;i<100;i++) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(i);
	}
	System.out.println("Thread1 done first");
});
Thread t1=new Thread(()->{
	for(int i=1;i<100;i++) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(i);
	}
	System.out.println("Thread2 done first");
});

Thread t2=new Thread(()->{
	for(int i=1;i<100;i++) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(i);
	}
	System.out.println("Thread3 done first");
});

Thread t3=new Thread(()->{
	for(int i=1;i<100;i++) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		System.out.println(i);
	}
	System.out.println("Thread4 done first");
});
t.start();
t1.start();
t2.start();
t3.start();

	}

}
