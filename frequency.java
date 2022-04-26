package com.dit.dsa;

public class frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[] = { 10, 10, 10, 20, 30, 40, 40 };
		int fre = 1, i;

		for ( i = 0; i < ar.length - 1; i++) {
			if (ar[i] == ar[i + 1]) {
				fre++;
			} else {

				System.out.println("Freuqency of " + ar[i] + " is " + fre);

				fre = 1;

			}
		}
		System.out.println("Freuqency of " + ar[i] + " is " + fre);
	}
}
