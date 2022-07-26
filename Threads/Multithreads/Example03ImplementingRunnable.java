//Multithread.java
package multithread;

/*
 * Second way to create a multithreadable java class:
 * implement the Runnable interface and it is necessary to have its own implementation of the run() method
 * on main method, start() cannot be callled directly anymore, because we don't extend Thread class
 * So, in order to to that, we need to instantiate a new Thread
 * 
 * the advantages of using this second way is the flexibility because you can implement other interfaces and also extend from another class
 * Note! Java only allow us to extend from one class, but we can implement as many interfaces as we want
 * 
 * INTERESTING METHODS TO DEAL WITH
 * join() - when we want to wait for one thread to be completed before start another. -> surround by a try/catch
 * isAlive() - return a boolean for whether the thread is currently still running.
 */

public class Multithread {
	
	public static void main(String[] args) {
		
		for (int i=0; i < 5; i++) {
			MultithreadExample mt = new MultithreadExample(i);
			//plus step before call the start() method
			Thread myThread = new Thread(mt);
			//instead of calling mt, call myThread
			myThread.start();
		}

	}

}



//MultithreadExample.java
package multithread;

public class MultithreadExample implements Runnable {
	
	
	private int threadNumber;
	public MultithreadExample(int threadNumber) {
		this.threadNumber = threadNumber;
	}
	
	@Override
	public void run() {
		for (int i = 0; i<= 5; i++) {
			System.out.println(i + "from Thread " + threadNumber);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
		
	}

}
