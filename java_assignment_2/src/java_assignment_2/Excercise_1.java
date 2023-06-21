package java_assignment_2;

import java.util.Scanner;

public class Excercise_1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// Question 1
		
		String Dep = null;
		if (Dep == null ) {
			System.out.println("nhan vien nay chua co phong ban");
		}else {
			System.out.println("Phong ban nhan vien nay la: " + Dep);

		}
		
		
		System.out.println("------");
		
		
		// Question 2
		
		int Gr = 2;
		if (Gr == 0) {
			System.out.println("nhan vien nay chu co group");
		}else if (Gr == 1 || Gr == 2){
			System.out.println("Group cua nhan vien nay la java fresher, C# fresher");
		}else if (Gr == 3) {
			System.out.println("nhan vien nay la nguoi quan trong tham gia nhieu group");
		}else {
			System.out.println("nhan vien nay la nguoi hong chuyen, tham gia tat ca cac group");
		}
		
		
		System.out.println("------");
		
		// Question 3
		
		String Dep1 = null;
		System.out.println((Dep1 == null) ? ("nhan vien nay chua co phong ban") :("phong ban nhan vien nay la: " + Dep1)); 
		
		System.out.println("------");
		
		// Question 4
		String Position = "Sale";
		System.out.println((Position == "Dev")? ("Day la Developer"):("nguoi nay khong phai la Developer"));
		
		System.out.println("------");
		
		
		// Question 5
		
		int AC = 3;
		switch (AC) {
		case 1:
			System.out.println("nhom co 1 thanh vien");
			break;
			
		case 2:
			System.out.println("nhom co 2 thanh vien");
			break;
			
		case 3:
			System.out.println("nhom co 3 thanh vien");
			break;
			
		default:
			System.out.println("nhom co nhieu thanh vien");
			break;
		}
		
		
		System.out.println("------");
		
		
		// Question 6
		
		int Gr2 = 1;
		switch (Gr2) {
		case 0: 
			System.out.println("nhan vien nay chua co group");
			break;
			
		case 1:
		case 2:
			System.out.println("group nhan vien la Java Fresher, C# Fresher");
			break;
			
		case 3:
			System.out.println("nhan vien nay la nguoi quang trong, tham gia nhieu group");
			break;
			
		default:
			System.out.println("nhan vien nay la nguoi hong chuyen, tham gia tat ca cac group");
			break;
			}
		
		System.out.println("------");
		
		
		// question 7
		
		String Ac2 = "manager";
		switch (Ac2) {
		case "Dev":
			System.out.println("day la developer");
			break;
			
		default:
			System.out.println("nguoi nay khong phai la developer");
				
		}
		
		System.out.println("------");
		
		
		// Question 8
		
		String[] ac_count = {"Email", "FullName", "DepartmentName"};
		for (String AC1 : ac_count) {
			System.out.println(AC1);
		}
		
		System.out.println("------");
		
		
		
		// Question 10
		
		for (int i = 1; i < 3; i++) {
			switch (i) {
			case 1:
				System.out.println("Email: NguyenVanA@gmail.com\n" 
						+ "Full name: Nguyen Van A\n" 
						+ "Department: Sale");
				break;
			
			case 2:
				System.out.println("Email: NguyenVanB@gmail.com\n"
						+ "Full name: Nguyen Van B\n"
						+ "Department: Marketting");
				break;
			
			default:
				System.out.println("chua co du lieu");
				break;	
			}
		}
		
		System.out.println("------");
		
		
		// Question 11
		
		for (int n = 1; n <= 2; n++) {
			if (n == 1) {
				System.out.println("Id: 1\n"
						+ "Name: Sale");
			}else {
				System.out.println("Id: 2\n"
						+ "Name: Marketting");
			}
		}
		
		System.out.println("------");
		
		
		// Question 15
		
		
		for (int x = 0; x < 20; x++) {
			if(x % 2 == 0) {
			System.out.println("cac so chan < 20 la: " + x);
			}else {
			
			}
		}
		
		System.out.println("------");
		 
		// Question 16
		
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap gia tri u = ");
		int u = sc.nextInt();
		
		while (u < 10) {
			if (u % 2 == 1 ) {
				System.out.println("so le la: " + u);
			}else {
				System.out.println("so chan la: " + u);
			}
			break;
		}
		
		
		
		
		
}
}