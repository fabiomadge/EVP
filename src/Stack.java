class Stack{
	public List l;

	public Stack(){
		l = new List();
	}

	public synchronized void add(Object o){
		l.add(o);
		notify();
	}

	public synchronized Object take(){
		while(l.nil()){
			try{
				wait();
			}
			catch(InterruptedException e){}
		}
		Object fst = l.head();
		l = l.tail();
		return fst;
	}
}