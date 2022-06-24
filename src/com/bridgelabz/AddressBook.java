package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	static ArrayList<Contacts> contactList = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		AddressBook addressBook = new AddressBook();
		Scanner sc = new Scanner(System.in);
		int exit = 1;
		while (exit == 1) {
			System.out.println(" Welcome to address book program ");
			System.out.println(" Select a choice : 1. Add 2.Edit 3.Delete  4. Exit");
			System.out.print(":==");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				addressBook.addContact();
				break;

			case 2:
				if (addressBook.contactList.isEmpty()) {
					System.out.println(" Address book is empty ");
					break;
				}
				addressBook.editContact();
				break;

			case 3:
				if (addressBook.contactList.isEmpty()) {
					System.out.println(" Address book is empty ");
					break;
				}
				addressBook.deleteContact();

			case 4:
				exit = 0;
				break;

			default:
				System.out.println(" Enter a valid choice");
				break;
			}
		}
		System.out.println(addressBook.contactList);
	}

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

	// method for editing existing contact
	public void editContact() {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the first name ");
		String fName = sc.nextLine();

		for (int index = 0; index < contactList.size(); index++) {

			if (contactList.get(index).getFirstName().equals(fName)) {
				contactList.remove(index);

				AddressBook addressBook = new AddressBook();
				addressBook.addContact();

			} else {
				System.out.println(" There is no contact ");
			}
		}
	}

	public void deleteContact() {

		Scanner deleteNameInput = new Scanner(System.in);
		System.out.println(" Enter the first name ");
		String deleteFirstName = deleteNameInput.nextLine();

		for (int increment = 0; increment < contactList.size(); increment++) {
			if (contactList.get(increment).getFirstName().equals(deleteFirstName)) {
				contactList.remove(increment);
			} else {
				System.out.println(" Name does not exist");
			}
		}
	}

}
