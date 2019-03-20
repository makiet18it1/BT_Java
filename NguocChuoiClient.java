package test;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class NguocChuoiClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket skClient = new Socket("localhost", 4001);
			System.out.println("OK");
			System.out.println("Moi Nhap Chuoi");
			Scanner key = new Scanner(System.in);
			String chuoi = key.nextLine();
			DataOutputStream outClient = new DataOutputStream(skClient.getOutputStream());
			outClient.writeBytes(chuoi+"\n");
			DataInputStream inputClient = new DataInputStream(skClient.getInputStream());
			String chuoiNguoc = inputClient.readLine();
			System.out.println("Chuoi nhan duoc la : "+chuoiNguoc);
			
			skClient.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
