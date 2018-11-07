package AWT;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class DangKyGUI extends JFrame implements ActionListener{
	JLabel lblUsers;
	JTextField tfUsers;
	JLabel lblPass;
	JTextField tfPass;
	JLabel lblNam;
	JRadioButton rdoNam;
	JLabel lblNu;
	JRadioButton rdoNu;
	JLabel lblDK;
	JTextField tfDK;
	JButton btnDK;
	//tao group de nhom radion
	ButtonGroup bg;
	public DangKyGUI() {
		lblUsers = new JLabel();
		lblUsers.setText("Users");
		tfUsers = new JTextField(24);
		lblPass = new JLabel();
		lblPass.setText("Pass");
		tfPass = new JPasswordField(24);
		lblNam = new JLabel();
		lblNam.setText("Nam");
		rdoNam = new JRadioButton();
		lblNu = new JLabel();
		lblNu.setText("Nu");
		rdoNu = new JRadioButton();
		bg = new ButtonGroup();
		bg.add(rdoNam);
		bg.add(rdoNu);
		btnDK = new JButton("Dang Ky");
		
		Container cont = getContentPane();
		setSize(500,400);
		setLayout(new FlowLayout());
		cont.add(lblUsers);
		cont.add(tfUsers);
		cont.add(lblPass);
		cont.add(tfPass);
		cont.add(lblNam);
		cont.add(rdoNam);
		cont.add(lblNu);
		cont.add(rdoNu);
		cont.add(btnDK);
		setVisible(true);
btnDK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String GT="Nam";
				if(rdoNam.isSelected()==true) GT=rdoNam.getText();
				if(rdoNu.isSelected()==true) GT=rdoNu.getText();
				JOptionPane.showMessageDialog(null,"Users la "+tfUsers.getText()+" co gioi tinh la"+"Nam");
			}
		});
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new DangKyGUI();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
