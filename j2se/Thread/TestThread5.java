public class TestThread5 {	
	public static void main(String args[]){
		Runner5 r = new Runner5();
       	Thread t = new Thread(r);
        t.start();
        
        try{
        	t.join();
        }catch(InterruptedException e){
        }
        
        for(int i=0;i<50;i++){
        	System.out.println("Ö÷Ïß³Ì:" + i);
        }
    }
}

class Runner5 implements Runnable {
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println("SubThread: " + i);
		}
	}
}