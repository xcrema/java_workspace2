package java_interface;

import java.util.Scanner;

interface AdvancedArithmetic{
	int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic{
	public int divisor_sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n%i == 0) {
				sum+=i;
			}
		}
		
		return sum;
	}
}

public class Solution {
	public static void main(String[] args) {
		
		MyCalculator my_calc = new MyCalculator();
		System.out.println("I implemented: ");
		ImplementedInterfaceNames(my_calc);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(my_calc.divisor_sum(n)+"\n");
		sc.close();
	}
	
	static void ImplementedInterfaceNames(Object o) {
		
		Class[] theInterfaces = o.getClass().getInterfaces();
		for (int i = 0; i < theInterfaces.length; i++) {
			String interfaceName = theInterfaces[i].getName();
			System.out.println(interfaceName);
		}
	}
}
