package com.example;
public class Calculator{
	public double squareRoot(double x){
		return Math.sqrt(x);
	}
	public long factorial(int x){
		if(x<0){
			throw new IllegalArgumentException("negative number for factorial");
		}
			long result=1;
			for(int i=1;i<=x;i++){
				result*=i;
			}
			return result;
		}
		
	public double naturalLog(double x){
		return Math.log(x);
	}
	public double power(double x,double a){
		return Math.pow(x,a);
	}

}

