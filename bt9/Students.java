package bt9;

import java.util.ArrayList;
import java.util.Scanner;

public class Students {
	ArrayList<Students> ds = new ArrayList();
	String name;
	String dc;
	int ns;
	double diemT;
	double diemL;
	double diemH;
	public Students() {
		this.name="Nguyen Van A";
		this.dc="Da Nang";
		this.ns=2000;
		this.diemT=0.0;
		this.diemH=0.0;
		this.diemL=0.0;
	}
	public Students(String name, String dc, int ns, double diemT, double diemL, double diemH) {
		this.name=name;
		this.dc=dc;
		this.ns=ns;
		this.diemT=diemT;
		this.diemL=diemL;
		this.diemH=diemH;
	} 
	public double diemTB() {
		return (this.diemT+this.diemL+this.diemH)/3;
	}
	public int tuoi() {
		return (2018-this.ns);
	}
	public void Nhap() {
		Scanner k = new Scanner(System.in);
		System.out.println("Nhap so sinh vien: ");
		int soSV = Integer.parseInt(k.nextLine());
		for (int i=1;i<=soSV ;i++) {
			System.out.println("Nhap thong tin sinh vien thu "+i);
			System.out.println("Nhap ho va ten sinh vien: ");
			String name = k.nextLine();
			System.out.println("Nhap dia chi: ");
			String dc = k.nextLine();
			System.out.println("Nhap nam sinh: ");
			int ns = Integer.parseInt(k.nextLine());
			System.out.println("Nhap diem Toan: ");
			double diemT=Double.parseDouble(k.nextLine());
			System.out.println("Nhap diem Ly: ");
			double diemL=Double.parseDouble(k.nextLine());
			System.out.println("Nhap diem Hoa: ");
			double diemH=Double.parseDouble(k.nextLine());
			Students obj = new Students(name,dc,ns,diemT,diemL,diemH);
			obj.diemTB();
			obj.tuoi();
			ds.add(obj);
		}		
	}
	public void SX() {
		for (int i=0;i<ds.size();i++)
			for (int j=i+1;j<ds.size();j++)
				if (ds.get(i).diemTB()>ds.get(i).diemTB()) {
					Students temp = new Students();
					temp=ds.get(j);
					ds.set(j, ds.get(i));
					ds.set(i, temp);
				}
		System.out.println("Danh sach sinh vien sap xep theo chieu tang dan diem TB la: ");
		for (int i=0;i<ds.size();i++)
			System.out.println(ds.get(i).name+" co diem TB: "+ds.get(i).diemTB());
	}
	public void maxT() {
		double max=ds.get(0).diemT;
		int vt=0;
		for (int i=1;i<ds.size();i++)
			if (ds.get(i).diemT>max)
			{	
				max=ds.get(i).diemT;
				vt=i;
			}
		System.out.println("Sinh vien "+ds.get(vt).name+" co diem Toan cao nhat la "+ds.get(vt).diemT);
	}
	public void maxTB() {
		double max=ds.get(0).diemTB();
		int vt=0;
		for (int i=1;i<ds.size();i++)
			if (ds.get(i).diemTB()>max)
			{
				max=ds.get(i).diemTB();
				vt=i;
			}
		System.out.println("Sinh vien "+ds.get(vt).name+" co diem TB cao nhat la "+ds.get(vt).diemTB());
	}
	public void age() {
		System.out.println("Danh sach sinh vien co tuoi lon hon 23 la: ");
		for (int i=0;i<ds.size();i++)
			if (ds.get(i).tuoi()>23) 
				System.out.println(ds.get(i).name+" "+ds.get(i).tuoi()+" tuoi");
	}
	public void TimHo() {
		System.out.println("Danh sach sinh vien co ho Huynh la: ");
		for (int i=0;i<ds.size();i++)
			if (ds.get(i).name.startsWith("Huynh")==true)
				System.out.println(ds.get(i).name);
	}
	public void TimDC() {
		System.out.println("Danh sach sinh vien co dia chi o Da Nang la: ");
		for (int i=0;i<ds.size();i++)
			if (ds.get(i).dc.equals("Da Nang") || ds.get(i).dc.equals("da nang"))
				System.out.println(ds.get(i).name); 
	}
	public void DSSV() {
		boolean kt=true;
		do {
			int choose;
			Scanner k=new Scanner(System.in);
			System.out.println("Chon chuc nang: ");
			System.out.println("1. Nhap gia tri cho danh sach sinh vien.");
			System.out.println("2. Sap xep sinh vien theo chieu tang dan diem trung binh.");
			System.out.println("3. Tim doi tuong sinh vien co diem toan lon nhat.");
			System.out.println("4. Hien thi tat ca sinh vien co tuoi lon hon 23.");
			System.out.println("5. Tim tat ca cac sinh vien co ho \"Huynh\".");
			System.out.println("6. Hien thi danh sach cac sinh vien co dia chi Da Nang.");
			System.out.println("7. Tim SV co diem TB cao nhat.");
			System.out.println("8. Thoat.");
			choose = k.nextInt();
			switch (choose) {
			case 1:
				this.Nhap();
				break;
			case 2:
				this.SX();
				break;
			case 3:
				this.maxT();
				break;
			case 4:
				this.age();
				break;
			case 5:
				this.TimHo();
				break;
			case 6:
				this.TimDC();
				break;
			case 7:
				this.maxTB();
				break;
			case 8:
				kt=false;
				System.out.println("Chuong trinh ket thuc.");
				return;
			default: 
				System.out.println("Chon sai, vui long chon lai! "); 
			}
		}
		while (kt=true);
	}
}