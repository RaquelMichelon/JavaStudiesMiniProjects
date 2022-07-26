//Multithread.java
package multithread;

/*
 * If some thread get an exceptions, it doesn't impact any other one.
 * Either if the exception happens with some thread or main method
 */

public class Multithread {
	
	public static void main(String[] args) {
		
		for (int i=0; i < 5; i++) {
			MultithreadExample mt = new MultithreadExample(i);
			mt.start();
		}
		//example of exception on main thread
		throw new RuntimeException();


		
	}

}



//MultithreadExample.java
package multithread;

public class MultithreadExample extends Thread {
	
	
	private int threadNumber;
	public MultithreadExample(int threadNumber) {
		this.threadNumber = threadNumber;
	}
	
	@Override
	public void run() {
		for (int i = 0; i<= 5; i++) {
			System.out.println(i + "from Thread " + threadNumber);
			//let's just thrown an exception to verify the program behavior
			if (threadNumber == 3) {
				throw new RuntimeException();
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
		
	}

}
