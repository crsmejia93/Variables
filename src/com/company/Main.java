package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String firstInitial;
	    String lastName;
	    int houseNumber;
	    String streetName;
	    String streetType;
	    String city;

	    System.out.print("Enter an address: ");
	    firstInitial = input.next();
	    lastName = input.next();
	    houseNumber = input.nextInt();
	    streetName = input.next();
	    streetType = input.next();
	    city = input.next();

		System.out.println(firstInitial + " " + lastName + " " + houseNumber + " ");
		System.out.println(streetName + " " + streetType + " " + city);
    }
}
