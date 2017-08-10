package com.raja.simpleconstructor;

class Bike {
	String name;
	String regNo;
	long engineNo;
	
	Bike() {
		this.name = "No Name";
		this.regNo = "Not Yet Registered";
		this.engineNo = 9999999999999999L;
	}
}
public class Main {
	static void showBike(Bike b){
		System.out.println("\nBike Details");
		System.out.println("------------");
		System.out.println("Name:"+b.name);
		System.out.println("Reg No:"+b.regNo);
		System.out.println("Engine No:"+b.engineNo);
	}
	public static void main(String[] args) {
	
	Bike b = new Bike();
	b.name = "Honda Shine";
	b.regNo = "TN37BN0098";
	b.engineNo = 123467568949L;
	
	Bike b1 = new Bike();
	b1.name = "Hero Mastro";
	b1.regNo = "TN37FL7898";
	b1.engineNo = 123938468949L;
	
	Bike b2 = new Bike();
	
	showBike(b);
	showBike(b1);
	showBike(b2);
	}

}
