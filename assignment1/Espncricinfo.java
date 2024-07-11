package com.assignment1;

public class Espncricinfo {
	final int size = 50;
	private int id;
	private static int idGenerator = 100000;

//getMethod
	public int getId() {
		return id;
	}

//Default COnstructor
	public Espncricinfo() {
		super();
		this.id = idGenerator++;
	}

//Parameterized Constructor
	public Espncricinfo(int id) {
		super();
		this.id = idGenerator++;
	}

	public static void main(String[] args) {
//static methods so calling without obj
		getBatsman();
		getNoOfBatsmen();
		addBatsman("mani", 350, 2, 3);

	}

	public static String[] getBatsman() {
		String batsman[] = { "mani", "ravi", "hari", "etc" };
		System.out.println(batsman[0]);
		return batsman;
	}

	public static int getNoOfBatsmen() {
		int noOfBatsmen = 11;
		System.out.println(noOfBatsmen);
		return noOfBatsmen;

	}

	public static void addBatsman(String name, int runsScored, int centuries, int halfCenturies) {
		System.out.println("Batsman name is " + name + " Batsman scored total score is" + runsScored
				+ "No.of centuries are" + centuries + "No.of halfcenturies are" + halfCenturies);

	}

}
