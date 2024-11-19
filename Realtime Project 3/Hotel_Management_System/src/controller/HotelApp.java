package controller;

import java.util.Scanner;

import service.HotelService;
import serviceimpl.HotelServiceImpl;

public class HotelApp {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		HotelService h1 = new HotelServiceImpl();
		System.out.println("======WELCOME TO HOTEL MANAGEMENT SYSTEM======");
		while (true) {
			System.out.println("=============MENU==============");
			System.out.println(
					"1.Room Details\n2.Available Rooms\n3.Allocate Room\n4.CheckOut\n5.Find All Customer\n6.Find Customer By Id\n7.Exit");
			System.out.println("Enter Your Option");
			int op = ip.nextInt();
			switch (op) {
			case 1:
				h1.roomInfo();
				break;
			case 2:
				h1.availableRoom();
				break;
			case 3:
				h1.allocateRoom();
				break;
			case 4:
				h1.checkout();
				break;
			case 5:
				h1.findAllCustomer();
				break;
			case 6:
				h1.getCustomerById();
				break;
			case 7:
				System.out.println("====THANK YOU VISIT AGAIN====");
				System.exit(0);
			default:
				System.out.println("INVALID OPTION");
				break;

			}

		}

	}

}
