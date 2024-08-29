public class Fibonacci {

	public static void main(String[] args) { 
		int nthFib = Integer.parseInt(args[0]);
		System.out.println(new Fibonacci().findNthFib(nthFib));
	}

	private int findNthFib(int nthFib) {
		int currentFib = 1;
		int prevFib = 0;
		for (int i = 0; i < nthFib; i++) {
			int nextFib = currentFib + prevFib;
			prevFib = currentFib;
			currentFib = nextFib;
		}
		return currentFib;
	}
}
