package com.bjsxt.dp.Strategy;

public class Test {

	public static void main(String[] args) {
		//int[] a = {9, 5, 3, 7, 1};
		
		Cat[] a = {new Cat(5,5), new Cat(3,3), new Cat(1,1)};
		
		//Dog[] a = {new Dog(5), new Dog(3), new Dog(1)};
		DataSorter.sort(a);
		DataSorter.p(a);
		
//		Cat c= new Cat(170,50);
//		int height = c.getHeight();
//		System.out.print(height);

	}

}
