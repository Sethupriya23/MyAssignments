package Automation;

public class IsPrime {

	 public static void main(String[] args) {
	        int num = 2; // Change this number to test different values
	        boolean isPrime = true;

	        if (num <= 1) {
	            isPrime = false;
	        } else {
	            for (int i = 2; i <= Math.sqrt(num); i++) { // Optimized loop
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }

	        if (isPrime) {
	            System.out.println(num + " is a Prime number.");
	        } else {
	            System.out.println(num + " is not a Prime number.");
	        }
	    }
	}
