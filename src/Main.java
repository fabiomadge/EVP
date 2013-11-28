public class Main
{
	public static void main(String[] ss) throws Exception{
		Stack s = new Stack();

		(new Thread(new UI(s))).start();

		for(int i = 0; i < 9; i++){
			(new Thread(new Producer(s, 14))).start();
		}

		for(int i = 0; i < 10; i++){
			(new Thread(new Consumer(s, 15))).start();
		}
	}
}