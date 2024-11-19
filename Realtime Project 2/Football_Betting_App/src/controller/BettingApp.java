package controller;

import java.util.Scanner;

import service.BettingAppService;
import serviceimpl.BettingAppImplementation;

public class BettingApp {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		BettingAppService bs = new BettingAppImplementation();

		System.out.println("==============WELCOME TO FOOTBALL BETTING APP==========");

		while (true) {

			System.out.println("1.User Registration\n2.showUserDetails\n3.User Profile Management\n4.Betting Menu\n"
					+ "5.Check Balance\n6.Find User\n7.Add Balance in Your Wallet\n8.Withdraw Amounnt from Wallet\n9.exit");

			System.out.println("========ENTER YOUR OPTION=============");
			int choice = ip.nextInt();

			switch (choice) {
			case 1:
				bs.userRegistration();
				break;

			case 2:
				bs.showUserDetails();
				break;
			case 3:
				bs.userProfileManagement();
				break;

			case 4:
				bs.betting();
				break;

			case 5:
				bs.paymentHandling();
				break;

			case 6:
				bs.findUserByUsername();
				break;

			case 7:
				bs.addMoney();
				break;

			case 8:
				bs.withdrawMoney();
				break;

			case 9:
				System.out.println("==============THANK YOU==================");
				System.exit(0);

			default:
				System.out.println("Invalid Choice");
			}
		}

	}

}
