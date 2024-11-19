package serviceimpl;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import entity.Address;
import entity.userregistration;
import service.BettingAppService;

public class BettingAppImplementation implements BettingAppService {
	Scanner ip = new Scanner(System.in);
	ArrayList<userregistration> u1 = new ArrayList<userregistration>();
	String s1 = null;
	String s2 = null;

	@Override
	public void userRegistration() {
		System.out.println("====WELCOME TO USER REGISTRATION====");
		System.out.println();
		System.out.println("=====REGISTRATION FORM=======");

		System.out.print("Enter username: ");
		String username = ip.next();
		s1 = username;
		System.out.print("Enter password: ");
		String password = ip.next();
		System.out.print("Enter email: ");
		String email = ip.next();
		System.out.print("Enter first name: ");
		String firstName = ip.next();
		System.out.print("Enter last name: ");
		String lastName = ip.next();
		System.out.print("Enter initial balance: ");
		double initialBalance = ip.nextDouble();
		System.out.println("Enter Customer HouseNo");
		int h_No = ip.nextInt();
		System.out.println("Enter Customer Street");
		String street = ip.next();
		System.out.println("Enter Customer Pincode");
		long pincode = ip.nextLong();
		System.out.println("Enter Customer District");
		String dst = ip.next();
		System.out.println("Enter Customer State");
		String state = ip.next();
		Address a = new Address(h_No, street, pincode, dst, state);

		if (isUsernameUnique() == false) {

			u1.add(new userregistration(username, password, email, firstName, lastName, a, initialBalance));
			System.out.println("REGISTRATION SUCCESSFULL");

		} else {
			System.out.println("USERNAME ALREADY EXISTS");

		}

	}

	public boolean isUsernameUnique() {
		System.out.println("Enter the UserName you wish to Register");
		ip.nextLine();
		String username = ip.next();
		s2 = username;
		boolean flag = true;
		for (userregistration user : u1) {
			if (user.getUusername().equals(username)) {

				flag = false;
				break;
			}
		}
		if (flag == true && s1.equals(s2)) {
			System.out.println("=====Proceed======");
			return false;
		} else {
			System.out.println("========Failed To Register=========");
			return true;
		}
	}

	@Override
	public void showUserDetails() {

		if (u1.isEmpty()) {
			System.out.println("=====NO USER REGISTERED===== ");
		} else {
			System.out.println("=====Displaying User Details=====");
			for (userregistration user : u1) {
				System.out.println(user);
			}
		}
	}

	@Override
	public void userProfileManagement() {

		System.out.println("===========USER PROFILE UPDATE=========");
		System.out.println("=====ENTER USERNAME======");
		String username = ip.next();
		boolean flag = false;

		for (userregistration user : u1) {
			if (user.getUusername().equals(username)) {
				System.out.println("======SEARCHING USERNAME======");
				flag = true;
				break;
			}
		}
		if (flag == true) {
			System.out.println("=====USERNAME FOUND========");
			System.out.println("1.Update Password\n2.Update Email\n3.Update FirstName\n4.Update LastName\n5.Exit");
			int up = ip.nextInt();

			switch (up) {
			case 1:
				System.out.println("ENTER NEW PASSWORD");
				String password = ip.next();
				for (userregistration user : u1) {
					if (user.getUusername().equals(username)) {
						user.setUpassword(password);
					}
				}
				System.out.println("update Successful");
				break;
			case 2:
				System.out.println("ENTER NEW EMAIL");
				String email = ip.next();
				for (userregistration user : u1) {
					if (user.getUusername().equals(username)) {
						user.setUemail(email);
					}
				}
				System.out.println("update Successful");
				break;

			case 3:
				System.out.println("ENTER NEW FIRSTNAME");
				String firstname = ip.next();
				for (userregistration user : u1) {
					if (user.getUusername().equals(username)) {
						user.setUfirstname(firstname);
					}
				}
				System.out.println("update Successful");
				break;

			case 4:
				System.out.println("ENTER NEW LASTNAME");
				String lastname = ip.next();
				for (userregistration user : u1) {
					if (user.getUusername().equals(username)) {
						user.setUlastname(lastname);
					}
				}
				System.out.println("update Successful");
				break;

			case 5:
				System.out.println("THANK YOU");
				System.exit(0);

			default:
				System.out.println("INVALID CHOICE");
				break;

			}

		}

	}

	@Override
	public void paymentHandling() {

		boolean flag = false;
		System.out.println("Enter your Username");
		ip.nextLine();
		String username = ip.next();
		System.out.println("Enter your Password");
		ip.nextLine();
		String password = ip.next();
		System.out.println("=============CHECKING YOUR BALANCE================");
		for (userregistration user : u1) {
			if (user.getUusername().equals(username) && user.getUpassword().equals(password)) {

				System.out.println("Your Current Balance is :" + user.getUbalance());

				System.out.println("DO YOU LIKE TO PROCEED FURTHER FOR BALANCE WITHDRAW OR DEPOSIT ?");
				System.out.println("TYPE '1' for yes and '2 for no");
				int aw = ip.nextInt();

				switch (aw) {

				case 1:
					System.out.println("PROCEEDING...............");
					System.out.println("ENTER '1' for DEPOSIT AND '2' for WITHDRAW");
					int enter = ip.nextInt();
					switch (enter) {
					case 1:
						System.out.println("DIRECTING TO REFERRED PAGE.............");
						addMoney();
						break;

					case 2:
						System.out.println("DIRECTING TO REFERRED PAGE........");
						withdrawMoney();
						break;

					default:
						System.out.println("Invalid Choice.....");
						break;

					}
					break;

				case 2:
					System.out.println("THANK YOU .........");
					System.exit(0);

				default:
					System.out.println("INVALID CHOICE");
					break;

				}
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Invalid Credentials");
		}
	}

	@Override
	public void findUserByUsername() {

		boolean flag = false;
		System.out.println("ENTER THE USERNAME");
		String username = ip.nextLine();

		for (userregistration user : u1) {
			if (user.getUusername().equals(username)) {
				System.out.println("username found");
				System.out.println(user);
				flag = true;
				break;

			}
		}
		if (flag == false) {
			System.out.println("USERNAME NOT FOUND...");
		}

	}

	@Override
	public void addMoney() {
		boolean flag = false;
		System.out.println("Enter your Username");
		ip.nextLine();
		String username = ip.next();
		System.out.println("Enter your Password");
		ip.nextLine();
		String password = ip.next();
		System.out.println("Enter the Balance you want to add");
		double newbal = ip.nextDouble();
		for (userregistration user : u1) {
			if (user.getUusername().equals(username) && user.getUpassword().equals(password)) {

				user.setUbalance(user.getUbalance() + newbal);
				System.out.println("=====BALANCE ADDED SUCCESSFULLY====");
				System.out.println("YOUR NEW BALANCE IS: " + user.getUbalance());
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Incorrect User Details");
		}

	}

	@Override
	public void withdrawMoney() {
		boolean flag = false;
		System.out.println("Enter your Username");
		ip.nextLine();
		String username = ip.next();
		System.out.println("Enter your Password");
		ip.nextLine();
		String password = ip.next();
		System.out.println("Enter the Balance you want to Withdraw");
		double withdrawbal = ip.nextDouble();
		for (userregistration user : u1) {
			if (user.getUusername().equals(username) && user.getUpassword().equals(password)) {
				if (user.getUbalance() > withdrawbal) {
					user.setUbalance(user.getUbalance() - withdrawbal);
					System.out.println("=====WITHDRAW SUCCESSFULL=====");
					System.out.println("YOUR NEW BALANCE IS: " + user.getUbalance());
					flag = true;
					break;
				} else {
					System.out.println("Insufficient Balance");
				}

			}
			flag = true;
		}
		if (flag == false) {
			System.out.println("INCORRECT USER DETAILS");
		}

	}

	public void betting() {

		Random rand = new Random();
		int t1 = rand.nextInt(10);
		int t2 = rand.nextInt(10);

		double o1 = rand.nextDouble();
		double o2 = rand.nextDouble();

		boolean flag = false;
		System.out.println("Enter Your UserName");
		String username = ip.next();
		System.out.println("Enter Your Password");
		String password = ip.next();

		System.out.println("THE ODDS FOR TEAM 1 IS: " + o1);
		System.out.println("THE ODDS FOR TEAM 2 IS : " + o2);

		for (userregistration user : u1) {
			if (user.getUusername().equals(username) && user.getUpassword().equals(password)) {

				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("INVALID CREDENTIALS");
		}

		else {
			System.out.println("=========PREDICTION BAR========");
			System.out.println("====CHOOSE YOUR TEAM========");
			System.out.println("1.TEAM A\n2.TEAM B\n3.exit");
			int choose = ip.nextInt();

			System.out.println("Enter the Amount to Bet on your team");
			double amount = ip.nextDouble();

			for (userregistration user1 : u1) {
				if (amount < user1.getUbalance()) {
					System.out.println("AMOUNT ENOUGH TO PROCEED FOR BETTING");
					user1.setUbalance(user1.getUbalance() - amount);
					System.out.println("THE REMAINING BALANCE IN WALLET IS :" + user1.getUbalance());

					switch (choose) {

					case 1:
						System.out.println("Enter Your Prediction for The Team");
						int prediction1 = ip.nextInt();
						for (userregistration user : u1) {

							if (prediction1 > t2 && (o1 > o2 || o1 < o2)) {
								System.out.println("YOU WIN.....");
								System.out.println("THE SCORE OF TEAM A IS :" + t1);
								System.out.println("THE SCORE OF TEAM B IS: " + t2);
								System.out.println("TEAM A WINS BY " + (t1 - t2) + " Goals");

								user.setUbalance(user.getUbalance() + (amount * 2));
							} else if (prediction1 < t2 && (o1 > o2 || o1 < o2)) {
								System.out.println("YOU LOST.....");
								System.out.println("THE SCORE OF TEAM A IS :" + t1);
								System.out.println("THE SCORE OF TEAM B IS: " + t2);
								System.out.println("TEAM A LOST BY " + (t2 - t1) + " Goals");

							} else {
								System.out.println("GAME ENDS WITH DRAW");
							}
						}
						break;
					case 2:
						System.out.println("Enter Your Prediction for the Team ");
						int prediction2 = ip.nextInt();

						for (userregistration user : u1) {
							if (prediction2 > t1 && (o1 > o2 || o1 < o2)) {
								System.out.println("YOU WIN.....");
								System.out.println("THE SCORE OF TEAM A IS :" + t1);
								System.out.println("THE SCORE OF TEAM B IS: " + t2);
								System.out.println("TEAM B WINS BY " + (t2 - t1) + " Goals");
								user.setUbalance(user.getUbalance() + (amount * 2));

							} else if (prediction2 < t1 && (o1 > o2 || o1 < o2)) {
								System.out.println("YOU LOST.....");
								System.out.println("THE SCORE OF TEAM A IS :" + t1);
								System.out.println("THE SCORE OF TEAM B IS: " + t2);
								System.out.println("TEAM B LOST BY " + (t1 - t2) + " Goals");
							} else {
								System.out.println("GAME ENDS WITH DRAW");
								user.setUbalance(user.getUbalance() + (amount / 2));

							}
						}
						break;

					case 3:
						System.out.println("=============PREDICTION NOT MADE=========");
						System.out.println("=============THANK YOU");
						System.exit(0);

					default:
						System.out.println("INVALID CHOICE");
						break;

					}
				}

				else {
					System.out.println("AMOUNT INSUFFICIENT");

				}
			}

		}

	}
}