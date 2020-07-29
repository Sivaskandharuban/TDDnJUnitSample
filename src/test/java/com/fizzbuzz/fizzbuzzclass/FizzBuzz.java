package com.fizzbuzz.fizzbuzzclass;

public class FizzBuzz {

	public String play(int number) {
		
		if(number%3==0) {
			return "fizz";
		}
		
		else if(number%5==0) {
			return "buzz";
		}
		
		else {
		return String.valueOf(number);
		}
		
	}
	
	

}
