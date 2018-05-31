package com.bjsxt.dp.Strategy;

public class Cat implements Comparable {
	private Comparator comparator = new CatWeightComparator();
	public Cat(int height, int weight) {
		super();
		this.height = height;
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	private int height;
	private int weight;
	
	@Override
	public String toString() {
		return height + "|" + weight;
	}
	
	@Override
	public int compareTo(Object o) {
		return comparator.compare(this, o);

	}
	public Comparator getComparator() {
		return comparator;
	}
	public void setComparator(Comparator comparator) {
		this.comparator = comparator;
	}
	

}
