package com.test;

import java.util.Random;

public class OTPGenerator {
       
	public String generateOTP(int length) {
		String n="012@#$7890abcdef";
		Random random =new Random();
		char[]otp = new char[length];
		for(int i=0;i<length;i++) {
			otp[i]=n.charAt(random.nextInt(n.length()));
		}
		return new String(otp);
	}
	public static void main(String[] args) {
		OTPGenerator ot = new OTPGenerator();
		String output=ot.generateOTP(9);
		System.out.println("Your OTP is " +output);
	}
}
