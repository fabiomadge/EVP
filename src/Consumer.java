class Consumer implements Runnable{
	private Stack s;
	private double d;

	public Consumer(Stack stack, double duration){
		s = stack;
		d = duration;
	}

	public void run(){
		while(true){
			int elems = ((Int)(s.take())).get();
			for(int i = 0; i < elems; i++){
				try{
					Thread.sleep((long)d);
				}
				catch(InterruptedException e){}
			}
			System.out.println(elems + " consumed");
		}
	}
}