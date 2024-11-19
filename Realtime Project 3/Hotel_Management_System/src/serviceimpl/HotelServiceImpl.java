package serviceimpl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import dao.HotelRepo;
import entity.Address;
import entity.Customer;
import service.HotelService;
import java.util.Scanner;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

public class HotelServiceImpl implements HotelService, HotelRepo {
	Scanner ip = new Scanner(System.in);
	// non static block
	{
		// rooms creation
		for (int i = 1; i <= 10; i++) {
			cm.put(i, null);
		}

		for (int i = 1; i <= 8; i++) {
			sm.put(i, null);
		}
		for (int i = 1; i <= 5; i++) {
			dm.put(i, null);
		}
	}

	@Override
	public void roomInfo() {
		System.out.println("===========CLASSIC ROOMS===============");
		System.out.println("Hot Water : Yes");
		System.out.println("AC : No");
		System.out.println("TV : No");
		System.out.println("WIFI : No");
		System.out.println("Price : 2000 Rs");
		System.out.println("===========STANDARD ROOMS===============");
		System.out.println("Hot Water : Yes");
		System.out.println("AC : No");
		System.out.println("TV : Yes");
		System.out.println("WIFI : No");
		System.out.println("Price : 2500 Rs");
		System.out.println("===========DELUXE ROOMS===============");
		System.out.println("Hot Water : Yes");
		System.out.println("AC : Yes");
		System.out.println("TV : Yes");
		System.out.println("WIFI : Yes");
		System.out.println("Price :  3500 Rs");

	}

	public void checkRoom(LinkedHashMap<Integer, Customer> l1) {
		boolean flag = false;
		for (Integer ele : l1.keySet()) {
			if (l1.get(ele) == null) {
				System.out.print(ele + " ");
				flag = true;
			}
		}
		System.out.println();
		if (flag == false) {
			System.out.println("NO ROOMS ARE AVAILABLE");
		}
	}

	@Override
	public void availableRoom() {
		System.out.println("=======AVAILABLE ROOMS======");
		System.out.println();
		System.out.println("========CLASSIC ROOMS=======");
		checkRoom(cm);
		System.out.println("========STANDARD ROOMS=======");
		checkRoom(sm);
		System.out.println("========DELUXE ROOMS=======");
		checkRoom(dm);

	}

	Customer createCustomer() {
		System.out.println("======Enter Customer Details========");
		System.out.println("Enter Customer ID");
		int cid = ip.nextInt();
		System.out.println("Enter Customer Age");
		int cage = ip.nextInt();
		System.out.println("Enter Customer Name");
		String cname = ip.next();
		System.out.println("Enter Customer phoneno");
		long cphno = ip.nextLong();
		System.out.println("Enter Customer Email");
		String cemail = ip.next();
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
		return new Customer(cid, cage, cname, cphno, cemail, a);

	}

	void mapRoom(LinkedHashMap<Integer, Customer> l1, int roomNo, double amount) {
		if (l1.get(roomNo) == null) {
			System.out.println("ROOMS AVAILABLE");
			Customer c = createCustomer();
			a1.add(c);
			l1.put(roomNo, c);
			c.setCamt(amount);
			System.out.println("Room No " + roomNo + " Has been Allocated For " + c.getCname());
			System.out.println("==============================================");

		} else {
			System.out.println("ROOM NOT AVAILABLE......!!!!");
		}
	}

	@Override
	public void allocateRoom() {

		System.out.println("======================MENU======================");
		System.out.println("1.Classic Room\n2.Standard Room\n3.Deluxe Room");
		int op = ip.nextInt();

		switch (op) {
		case 1:
			System.out.println("..........CLASSIC........");
			System.out.println("ENTER THE ROOM NO");
			int roomNo1 = ip.nextInt();
			if (roomNo1 >= 1 && roomNo1 <= 10) {
				mapRoom(cm, roomNo1, 2000);
			} else {
				System.out.println("Enter Correct Room No............");
			}
			break;
		case 2:
			System.out.println("..........STANDARD.........");
			System.out.println("ENTER THE ROOM NO");
			int roomNo2 = ip.nextInt();
			if (roomNo2 >= 1 && roomNo2 <= 8) {
				mapRoom(sm, roomNo2, 2500);
			} else {
				System.out.println("Enter Correct Room No............");
			}
			break;
		case 3:
			System.out.println("..........DELUXE ...........");
			System.out.println("ENTER THE ROOM NO");
			int roomNo3 = ip.nextInt();
			if (roomNo3 >= 1 && roomNo3 <= 5) {
				mapRoom(dm, roomNo3, 3500);
			} else {
				System.out.println("Enter Correct Room No............");
			}
			break;
		default:
			System.out.println("INVALID OPTION");
		}

	}

	void unMapRoom(LinkedHashMap<Integer, Customer> l1, int roomNo) {
		if (l1.get(roomNo) != null) {
			Customer c1 = l1.get(roomNo);
			System.out.println(c1);
			System.out.println(c1.getCname() + "  Need to pay  " + c1.getCamt() + " Rs.");
			l1.put(roomNo, null);
			// if we want to delete customer details from ArrayList
			// then l1.remove(c1);
		} else {
			System.out.println("Invalid RoomNo");
		}
	}

	@Override
	public void checkout() {
		System.out.println("==========WELCOME TO CHECKOUT PAGE===========");
		System.out.println("Enter the Type of Room you stayed in ");
		System.out.println("1.Classic Room\n2.Standard Room\n3.Deluxe Room");
		int op = ip.nextInt();
		System.out.println("Enter The RoomNo");
		int roomno = ip.nextInt();
		switch (op) {
		case 1:
			if (roomno >= 1 && roomno <= 10) {
				unMapRoom(cm, roomno);
			} else {
				System.out.println("Invalid RoomNo");
			}
			break;
		case 2:
			if (roomno >= 1 && roomno <= 8) {
				unMapRoom(sm, roomno);
			} else {
				System.out.println("Invalid RoomNo");
			}
			break;
		case 3:
			if (roomno >= 1 && roomno <= 5) {
				unMapRoom(dm, roomno);
			} else {
				System.out.println("Invalid RoomNo");
			}
			break;
		default:
			System.out.println("INVALID OPTION.........");
			break;

		}
	}

	@Override
	public void findAllCustomer() {
		if (a1.size() == 0) {
			System.out.println("Database is Empty.....");
		} else {
			for (Customer ele : a1) {
				System.out.println(ele);
			}
		}

	}

	@Override
	public void getCustomerById() {
		boolean flag = false;
		System.out.println("Enter The Customer ID");
		int cid = ip.nextInt();

		for (Customer ele : a1) {
			if (ele.getCid() == cid) {
				System.out.println(ele);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Customer Is Not Present--INVALID CUSTOMER ID");
		}

	}

}
