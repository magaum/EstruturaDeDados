public class Principal {

	public static void main(String[] args) {
		System.out.println();
		
		
	}
		public static int fatorial(int fat) {
			if(fat<2) {
				return 1;
			}
			return fat*fatorial(fat-1);
		}
		public static long fibonacci(int fib) {
			if(fib <2) {
				return fib;
			}
			return fibonacci(fib-1)+fibonacci(fib-2);
		}
}
