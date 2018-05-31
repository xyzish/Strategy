package com.bjsxt.dp.Strategy;

public class Dog implements Comparable{
	
	public Dog(int food) {
		super();
		this.food = food;
	}

	private int food;

	public int getFood() {
		return food;
	}

	public void setFood(int food) {
		this.food = food;
	}

	@Override
	public int compareTo(Object o) {
		Dog d = (Dog)o;
		if(this.getFood() > d.getFood()) return 1;
		else if(this.getFood() < d.getFood()) return -1;
		else return 0;
	}
	
	@Override
	public String toString() {
		return "Dog:" + this.getFood();
		
	}

}
