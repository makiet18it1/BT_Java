package test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class NguocChuoiSever {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket serverSK = new ServerSocket(4001);
			Socket skServer = serverSK.accept();
			System.out.println("Client connected");
			
			//nhap du lieu
			DataInputStream inputServer = new DataInputStream(skServer.getInputStream());
			String chuoi = inputServer.readLine();
			System.out.println("Chuoi Nhan Duoc La");
			StringBuffer chuoiNguoc = new StringBuffer(chuoi); 
			
			//gui chuoi nguoc ve client
			DataOutputStream outServer = new DataOutputStream(skServer.getOutputStream());
			outServer.writeBytes(chuoiNguoc.reverse().toString());
			skServer.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
