package AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class SimpleCalculator extends Frame implements ActionListener
{
	private TextField display;
	private double arg = 0;
	private String op = "=";
	private boolean start = true;
	public SimpleCalculator() 
	{
		setTitle("Calculator");
		setSize(300, 400);
		display = new TextField("0");
		display.setEditable(false);
		add(display,"North");
		Panel p = new Panel();
		p.setLayout(new GridLayout(4,4));
		String buttons[] = {"7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};
		for (int i = 0; i < buttons.length;i++)
		{
			Button button = new Button(buttons[i]);
			p.add(button);
			button.addActionListener(this);
		}
		add(p,"Center");
		addWindowListener(new WindowAdapter() 
		{
			public void winClosing(WindowEvent e) 
			{
				System.exit(0);
			}
		});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s = e.getActionCommand();
		if ('0' <= s.charAt(0) && s.charAt(0) <= '9' || s.equals("."))
		{
			if(start)
			{
				display.setText(s);
			}
			else 
			{
				display.setText(display.getText() + s);
			}
			start = false ;			
		}
		else 
		{
			if (start)
			{
				if (s.equals("-"))
				{
					display.setText(s);
					start = false;
				}
				else
				{
					op = s;
				}
			}
			else 
			{
				double x = Double.parseDouble(display.getText());
				calculate(x);
				op = s;
				start = true;
			}
		}
	}

	private void calculate(double x) 
	{
		// TODO Auto-generated method stub
		if (op.equals("+"))
		{
			arg += x;
		}
		else
			if (op.equals("-"))
			{
				arg -= x;
			}
			else
				if (op.equals("*"))
				{
					arg *= x;
				}
				else
					if(op.equals("/"))
					{
						arg /= x;
					}
					else
						if(op.equals("="))
						{
							arg = x;
						}
		display.setText("" + arg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleCalculator frame = new SimpleCalculator();
		frame.show();
	}

	
		
	
}
