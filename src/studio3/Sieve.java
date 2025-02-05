package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What's the total number you want to find prime numbers up to?");
		int n = in.nextInt();
		
		boolean [] primeNumberArray = new boolean [n];
		for(int i=0; i<n; i++ ) {
			primeNumberArray[i] = true;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (primeNumberArray [i] == true) {
				for (int j = i*i; j < n; j=j+i) {
				primeNumberArray [j] = false;}		
		
				
		}
	}
		for (int i=2; i<n; i++) {
			if (primeNumberArray[i] == true) {
				System.out.println(i);
			}
			
		}
	}
}
