class Producer implements Runnable{
	private Stack s;
	private double d;

	public Producer(Stack stack, double duration){
		s = stack;
		d = duration;
	}

	public void run(){
		while(true){
			int elems = (int)(Math.random()*100);
			for(int i = 0; i < elems; i++){
				try{
					Thread.sleep((long)d);
				}
				catch(InterruptedException e){}
			}
			s.add(new Int(elems));
			System.out.println(elems + " produced");
		}
	}
}