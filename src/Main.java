public class Main
{
	public static void main(String[] ss) throws Exception{
		Stack s = new Stack();
		(new Thread(new Producer(s, 1))).start();
		(new Thread(new Producer(s, 2))).start();
		(new Thread(new Consumer(s, 15))).start();
		(new Thread(new Consumer(s, 15))).start();
		(new Thread(new Consumer(s, 15))).start();
		(new Thread(new Consumer(s, 15))).start();
		(new Thread(new Consumer(s, 15))).start();
		(new Thread(new Consumer(s, 15))).start();
		(new Thread(new Consumer(s, 15))).start();
		(new Thread(new Consumer(s, 15))).start();
		(new Thread(new Consumer(s, 15))).start();
		(new Thread(new Consumer(s, 15))).start();
		(new Thread(new Consumer(s, 15))).start();
		(new Thread(new Consumer(s, 15))).start();
		(new Thread(new Consumer(s, 15))).start();
		(new Thread(new Consumer(s, 15))).start();
		(new Thread(new Consumer(s, 15))).start();
		(new Thread(new Consumer(s, 15))).start();
		(new Thread(new Consumer(s, 15))).start();
		(new Thread(new Consumer(s, 15))).start();
		(new Thread(new Consumer(s, 15))).start();
		(new Thread(new Consumer(s, 15))).start();
		(new Thread(new Consumer(s, 15))).start();
		(new Thread(new Consumer(s, 15))).start();
		(new Thread(new Consumer(s, 15))).start();
		(new Thread(new Consumer(s, 15))).start();
	}
}