package AWT;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GiaiThuaGUI extends JFrame implements ActionListener {
	JLabel lblSoN;
	JTextField tfSoN;
	JLabel lblKQ;
	JTextField tfKQ;
	JButton btnKQ;
	public GiaiThuaGUI() {
		lblSoN = new JLabel();
		lblSoN.setText("So N");
		tfSoN = new JTextField(10);
		lblKQ = new JLabel();
		lblKQ.setText("Ket Qua");
		tfKQ = new JTextField(10);
		btnKQ = new JButton("Tinh Giai Thua");
		btnKQ.addActionListener(this);
		//tao container de add cac componet
		Container cont = getContentPane();
		setSize(500,400);
		setLayout(new FlowLayout());
		cont.add(lblSoN);
		cont.add(tfSoN);
		cont.add(lblKQ);
		cont.add(tfKQ);
		cont.add(btnKQ);
		setVisible(true);
				
	}
	public void actionPerformed(ActionEvent e) {
		String so = tfSoN.getText();
		int n = Integer.parseInt(so);
		int gt = 1;
		for (int i = 2;i<=n;i++) gt = gt*i;
		tfKQ.setText(String.valueOf(gt));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GiaiThuaGUI();
	}

}
