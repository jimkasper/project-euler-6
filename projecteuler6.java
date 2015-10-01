public class projecteuler6 {
	public static void main(String[] args) {
		
	int square = 0;
	int sumS = 0;
	
// sum of the squares		
	int a = 0;
	for(int sum = a*a; a < 101; a++){
			sumS = a*a + sum + sumS;
	}	
	
// square of the sum
	int b = 0;
	for(int total = b; b < 101; b++){
			total = total + b;
			square = total*total;
	}	
	
// difference
int difference = square - sumS;
		
		
		System.out.println("Square of the sums: "+square);
		System.out.println("Sum of the squares: "+sumS);	
		System.out.println("Difference: "+difference);
		
		
		
	}
}