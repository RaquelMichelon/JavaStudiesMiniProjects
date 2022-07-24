package puzzle01;

public class Puzzle01Solved {
	
	public void sum(int a, double b) {
		System.out.println(a + b);
	}
	
	public int sum(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) { 
		Puzzle01Solved p1 = new Puzzle01Solved();
		p1.sum(10, 20); 
		System.out.println(p1.sum(10, 20));
	}

}
