class UI implements Runnable{
	Stack s;

	public UI(Stack stack){
		s = stack;
	}

	public void run(){
		while(true){
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){}
			System.out.println(s.size());
		}
	}
}