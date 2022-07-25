package multithread;

/*
 * 2 ways:
 * First - extends the Thread Class and override the run method
 * To kick off that, in the main class call the Thread created
 * If we call the run method, it will not run in a multiple concurrent threads process
 * So, to do that we will call the method start()
 * 
 * To assign a number to a thread we could go to the MultithreadExample class and create a new constructor
 *  and back to the main, pass the index as a parameter
 *  
 *  Note! There is no guarantee which thread is doing the counting first.
 */
public class Multithread {
	
	public static void main(String[] args) {
		
//		MultithreadExample mt1 = new MultithreadExample();
//		MultithreadExample mt2 = new MultithreadExample();
//		MultithreadExample mt3 = new MultithreadExample();
		
//		mt1.start();
//		mt2.start();
//		mt3.start();
		
		//5 multithread counting one to five at exactly the same time
		for (int i=0; i < 5; i++) {
			MultithreadExample mt = new MultithreadExample(i);
			mt.start();
		}

		
	}

}




//MultithreadExample.java
package multithread;

public class MultithreadExample extends Thread {
	
	
	private int threadNumber;
	//new constructor
	public MultithreadExample(int threadNumber) {
		this.threadNumber = threadNumber;
	}
	
	@Override
	public void run() {
		//Count up the numbers from 1 to 5
		for (int i = 0; i<= 5; i++) {
			System.out.println(i + "from Thread " + threadNumber);
			
			//sleep for one second
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
		
	}

}
