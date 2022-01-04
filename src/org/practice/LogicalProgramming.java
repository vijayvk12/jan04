package org.practice;

public class LogicalProgramming {

	
	public static void main(String[] args) {
		//check given number is odd number or even number num=23
//		int num=23;
//		if (num %2==0) {
//			System.out.println("evennumber");
//		}else {
//			System.out.println("odd number");
//		}
//	print odd number in b/w 1 to 100
		//for(int i=1;i<=100;i++) {
//		if(i%2==0) {
//				System.out.println(i);
//			}
//		}
		
		int count =0;
		for (int i=1;i<=100;i++) {
	if(i%2==0) {
count++;
		}
	
	}
		System.out.println(count);
		}}