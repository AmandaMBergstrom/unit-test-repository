package com.promineotech;

import java.util.Random;
import java.util.function.IntPredicate;

public class TestDemo {
	
	public int addPositive(int a, int b) {
		if (a > 0 && b >0) {
			return a + b;
		}else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
	}
	
	 int getRandomInt() {
        Random random = new Random();
        return random.nextInt(10) + 1;
       
    }
	 //Method for fun
	 public int addNegative(int a, int b) {
		 if(a < 0 && b < 0) {
			 return a + b;
		 }else {
				throw new IllegalArgumentException("Both parameters must be negative!");
		 }
	}

	public int randomNumberSquared() {
		// TODO Auto-generated method stub
		return 0;
	}
}

