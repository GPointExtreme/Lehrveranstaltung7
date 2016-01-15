
public class RecursiveMath {
	
	public static int sum(int n) {
		if(n == 0) {
			return 0;
		}
		return sum(n-1)+n;
	}
	
	//Fibonacci Folge
	public static int fib(int n) {
		if(n <= 2) {
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}

}
