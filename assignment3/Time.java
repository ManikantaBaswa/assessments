package com.assignment3;

public class Time {
	private int hh;
	private int mm;
	private int ss;

	public Time() {
		super();
		this.hh = 0;
		this.mm = 0;
		this.ss = 0;
	}

	public Time(int hh, int mm, int ss) {
		super();
		this.hh = hh;
		this.mm = mm;
		this.ss = ss;
	}

	public static void main(String[] args) {

		Time t1 = new Time(4, 40, 21);
		t1.displayTime();

		Time t2 = new Time(2, 55, 40);
		t2.displayTime();

		Time diff = diffTime(t1, t2);
		diff.displayTime();

	}

	public void displayTime() {
		System.out.printf("%02d:%02d:%02d\n", hh, mm, ss);
	}

	public static Time diffTime(Time t1, Time t2) {
		int hoursSub = t1.hh - t2.hh;

		int minuteSub = t1.mm - t2.mm;

		int secSub = t1.ss - t2.ss;

		if (secSub < 0) {
			secSub += 60;
			minuteSub--;
		}
		if (minuteSub < 0) {
			minuteSub += 60;
			hoursSub--;
		}

		return new Time(hoursSub, minuteSub, secSub);
	}

}
