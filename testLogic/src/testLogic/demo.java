package testLogic;

import java.util.ArrayList;
import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int soCot, soDong;
		Scanner sc = new Scanner(System.in);
		System.out.println("nội dung ô vuông : ");
		soDong = sc.nextInt();
		soCot = soDong;
//		System.out.println("Nhập số cột của mảng : ");
//		soCot = sc.nextInt();
		String arrHinhVuong[][];
		arrHinhVuong = new String[soDong][soCot];

		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.println("Nhập mảng thứ [" + i + "," + j + "]");
				arrHinhVuong[i][j] = sc.next();
			}
		}

		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print(arrHinhVuong[i][j] + "\t");
			}
			System.out.println("\n");
		}

		System.out.println("các nội dung chuỗi chữ cái xem có thể tạo ra từ bảng hay ko");
		int a = sc.nextInt();

		String arrCheck[];
		arrCheck = new String[a + 1];

		for (int t = 0; t < a + 1; t++) {
			arrCheck[t] = sc.nextLine();
		}

		String z = "";
		String p = "";
		String l = "";
		String o = "";
		

		for (int j = 0; j < soCot; j++) {

			z = z + arrHinhVuong[0][j];
		}

		for (int i = 0; i < soDong; i++) {
			p = p + arrHinhVuong[i][0];
		}
		
		for (int i = soDong - 1 ; i >= 0; i--) {
			l = l + arrHinhVuong[i][0];
		}
		for (int j = soCot - 1 ; j >= 0; j--) {
			o = o + arrHinhVuong[0][j];
		}

	

		for (int t = 1; t < a + 1; t++) {
			if (z.contains(arrCheck[t]) == true) {
				System.out.println("yes");
			} else if (p.contains(arrCheck[t]) == true) {
				System.out.println("yes");
			}
			else if (l.contains(arrCheck[t]) == true) {
				System.out.println("yes");
			}

			else if (o.contains(arrCheck[t]) == true) {
				System.out.println("yes");
			}

			else {
				System.out.println("no");
			}

		}

	}
}
