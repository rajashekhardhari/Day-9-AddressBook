package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	static ArrayList<Contacts> contactList = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void addContact() {
		System.out.println(" Enter your first name : ");
		String firstName = sc.nextLine();
		System.out.println(" Enter your last name : ");
		String lastName = sc.nextLine();
		System.out.println(" Enter your city name : ");
		String city = sc.nextLine();
		System.out.println("Enter your state  : ");
		String state = sc.nextLine();
		System.out.println(" Enter your zip code : ");
		long zip = sc.nextLong();
		System.out.println(" Enter your phone number : ");
		long phoneNumber = sc.nextLong();
		System.out.println(" Enter your email : ");
		String email = sc.next();

		Contacts addressBook = new Contacts(firstName, lastName, email, city, state, phoneNumber, zip);
		contactList.add(addressBook);
	}

	// main Method
	public static void main(String[] args) {
		System.out.println("****** Welcome To The Address Book Program ******");

		Scanner scanner = new Scanner(System.in);
		int exit = 1;
		while (exit == 1) {
			System.out.println("Choose your choice: 1.Add 2.Exit");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				addContact();
				break;
			case 2:
				exit = 0;
				break;
			case 3:
				System.out.println("Enter a valid choice");
				break;

			}

		}
		System.out.println(contactList);
	}
}
