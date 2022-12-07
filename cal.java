package majeed;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class cal{
String number1 = "";
String  number2 = "";
int n1 = 0;
int n2 = 0;
double result = 0.0;
String op = "";
double convert;
String str;
String eq = "";
String sign = "-";
boolean point1 = false;
boolean point2 = false;
JTextField tf = new JTextField();
JFrame frame = new JFrame("My Calculator");
JPanel panel = new JPanel();
JButton button1 = new JButton("1");
JButton button2 = new JButton("2");
JButton button3 = new JButton("3");
JButton button4 = new JButton("4");
JButton button5 = new JButton("5");
JButton button6 = new JButton("6");
JButton button7 = new JButton("7");
JButton button8 = new JButton("8");
JButton button9 = new JButton("9");
JButton button10 = new JButton("0");
JButton button11 = new JButton("+");
JButton button12 = new JButton("-");
JButton button13 = new JButton("/");
JButton button14 = new JButton("*");
JButton button15 = new JButton("+/-");
JButton button16 = new JButton(".");
JButton button17 = new JButton("C");
JButton button18 = new JButton("=");
public cal(){
tf.setBounds(15, 15, 305, 42);
button1.setBounds(15, 80, 60, 58);
button2.setBounds(97, 80, 60, 58);
button3.setBounds(178, 80, 60, 58);
button4.setBounds(259, 80, 60, 58);
button5.setBounds(15, 160, 60, 58);
button6.setBounds(97, 160, 60, 58);
button7.setBounds(178, 160, 60, 58);
button8.setBounds(259, 160, 60, 58);
button9.setBounds(15, 240, 60, 58);
button10.setBounds(97, 240, 60, 58);
button11.setBounds(178, 240, 60, 58);
button12.setBounds(259, 240, 60, 58);
button13.setBounds(15, 320, 60, 58);
button14.setBounds(97, 320, 60, 58);
button15.setBounds(178, 320, 60, 58);
button16.setBounds(259, 320, 60, 58);
button17.setBounds(15, 400, 142, 42);
button18.setBounds(178, 400, 142, 42);

button1.setFocusable(false);
button2.setFocusable(false);
button3.setFocusable(false);
button4.setFocusable(false);
button5.setFocusable(false);
button6.setFocusable(false);
button7.setFocusable(false);
button8.setFocusable(false);
button9.setFocusable(false);
button10.setFocusable(false);
button15.setFocusable(false);
button16.setFocusable(false);
button17.setFocusable(false);
button18.setFocusable(false);

panel.add(tf);
panel.add(button1);
panel.add(button2);
panel.add(button3);
panel.add(button4);
panel.add(button5);
panel.add(button6);
panel.add(button7);
panel.add(button8);
panel.add(button9);
panel.add(button10);
panel.add(button11);
panel.add(button12);
panel.add(button13);
panel.add(button14);
panel.add(button15);
panel.add(button16);
panel.add(button17);
panel.add(button18);
button1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
        if(eq.equals(" = "))
        {
        tf.setText("");
			number1 = "";
				number2 = "";
				op = "";
				eq = "";
				result = 0;
			}
			else
			{
				tf.setText(tf.getText() + "1");
			    if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))
			    {
					number2 += "1";
					tf.setText(number2);
			    }
			   else
			   {
				   number1 += "1";
				   tf.setText(number1);
			   }
		   }
		}
		});
		button2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ee)
		{
			if(eq.equals(" = "))
			{
				tf.setText("");
				number1 = "";
				number2 = "";
				op = "";
				eq = "";
				result = 0;
			}
			else
			{
				tf.setText(tf.getText() + "2");
			    if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))
			    {
					 number2 += "2";
					 tf.setText(number2);
			    }
			   else
			   {
				     number1 += "2";
				     tf.setText(number1);
			   }
		   }
		}
		});
		button3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent eee)
		{
			if(eq.equals(" = "))
			{
				tf.setText("");
				number1 = "";
				number2 = "";
				op = "";
				eq = "";
				result = 0;
			}
			else{
				tf.setText(tf.getText() + "3");
			    if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))
			    {
					number2 += "3";
					tf.setText(number2);
			    }
			   else
			   {
				   number1 += "3";
				   tf.setText(number1);
			   }
		   }
		}
		});
		button4.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent eeeee)
		{
			if(eq.equals(" = "))
			{
				tf.setText("");
				number1 = "";
				number2 = "";
				op = "";
				eq = "";
				result = 0;
			}
			else
			{
				tf.setText(tf.getText() + "4");
			    if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))
			    {
					number2 += "4";
					tf.setText(number2);
			    }
			   else
			   {
				   number1 += "4";
				   tf.setText(number1);
			   }
		   }
		}
		});
		button5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent eeeeee)
			{
				if(eq.equals(" = "))
				{
					tf.setText("");
					number1 = "";
					number2 = "";
					op = "";
					eq = "";
					result = 0;
				}
				else
				{
					tf.setText(tf.getText() + "5");
				    if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))
				    {
						number2 += "5";
						tf.setText(number2);
				    }
				   else
				   {
					   number1 += "5";
					   tf.setText(number1);
				   }
			   }
			}
			});
		button6.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent eeeeee)
		{
				if(eq.equals(" = "))
				{
					tf.setText("");
					number1 = "";
					number2 = "";
					op = "";
					eq = "";
					result = 0;
				}
				else
				{
					tf.setText(tf.getText() + "6");
				    if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))
				    {
						number2 += "6";
						tf.setText(number2);
				    }
				   else
				   {
					   number1 += "6";
					   tf.setText(number1);
				   }
			   }
			}
		
		});
		button7.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent eeeeeee)
		{
			if(eq.equals(" = "))
			{
				tf.setText("");
				number1 = "";
				number2 = "";
				op = "";
				eq = "";
				result = 0;
			}
			else
			{
				tf.setText(tf.getText() + "7");
			    if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))
			    {
					number2 += "7";
					tf.setText(number2);
			    }
			   else
			   {
				   number1 += "7";
				   tf.setText(number1);
			   }
		   }
		}
		});
		button8.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ek)
		{
				if(eq.equals(" = "))
				{
					tf.setText("");
					number1 = "";
					number2 = "";
					op = "";
					eq = "";
					result = 0;
				}
				else
				{
				    if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))
				    {
						number2 += "8";
						tf.setText(number2);
				    }
				   else
				   {
					   number1 += "8";
					   tf.setText(number1);
				   }
			   }
			}
		});
		button9.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ek)
		{
			if(eq.equals(" = "))
			{
				tf.setText("");
				number1 = "";
				number2 = "";
				op = "";
				eq = "";
				result = 0;
			}
			else
			{
			    if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))
			    {
					number2 += "9";
					tf.setText(number2);
			    }
			   else
			   {
				   number1 += "9";
				   tf.setText(number1);
			   }
		   }
		}
		});
		button10.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent el)
		{
			if(eq.equals(" = "))
			{
				tf.setText("");
				number1 = "";
				number2 = "";
				op = "";
				eq = "";
				result = 0;
			}
			else
			{
			    if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))
			    {
					number2 += "0";
					tf.setText(number2);
			    }
			   else
			   {
				   number1 += "0";
				   tf.setText(number1);
			   } 
		   }
		}
		});
		button11.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent eeee)
		{
				if(!op.equals("+") && !eq.equals(" = "))
				{
				    op = "+";
				}
			}
		});
		button12.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent eeeeeeee)
		{
				if(!op.equals("-") && !eq.equals(" = "))
				{
				    op = "-";
				}
			}
		});
		button13.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent excsa)
		{
				if(!op.equals("/") && !eq.equals(" = "))
				{
				    op = "/";
				}
			}
		});
		button14.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ess)
		{
				if(!op.equals("*") && !eq.equals(" = "))
				{
				    op = "*";
				}
			}
		});
		button15.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent el)
		{
				if(eq.equals(" = "))
				{
					tf.setText("");
					number1 = "";
					number2 = "";
					op = "";
					eq = "";
					result = 0;
				}
				else
				{
				    if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))
				    {
				    	if(sign.equals("-")) {
				    		n2 = Integer.parseInt(number2) * -1;
				    		number2 = String.valueOf(n2);
				    		sign = "";
				    	}else {
				    		n2 = Integer.parseInt(number2) * -1;
				    		number2 = String.valueOf(n2);
				    		sign = "-";
				    	}
				    	
				    	tf.setText(number2);
				    }
				   else
				   {
					   if(sign.equals("-")) {
						   n1 = Integer.parseInt(number1) * -1;
				    	   number1 = String.valueOf(n1);
				    	   sign = "";
				    	}else {
				    	   n1 = Integer.parseInt(number1) * -1;
				    	   number1 = String.valueOf(n1);
				    	   sign = "-";
				    	}
					   tf.setText(number1);
				   }
			   }
			}
		});
		button16.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent eas)
			{
				if(eq.equals(" = "))
				{
					tf.setText("");
					number1 = "";
					number2 = "";
					op = "";
					eq = "";
					result = 0;
				}
				else
				{
				    if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))
				    {
				    	if(!point2) {
				    	  number2 += ".";
						  tf.setText(number2);
						  point2 = true;
				    	}
						
				    }
				   else
				   {
					   if(!point1) {
						 number1 += ".";
					     tf.setText(number1); 
					     point1 = true;
					   }
					   
				   }
			   }

			}
			});
		button17.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent eweqatt)
		{
			tf.setText("");
			eq = "";
			op = "";
			number1 = "";
			number2 = "";
			result = 0.0;
		}
		});
		button18.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent elol)
		{
			if(eq.equals("") && (!number1.equals("") && !number2.equals("")))
			{
				    convert = bo(op);
				    str = String.valueOf(convert);
				    tf.setText(str);
				    eq = " = ";
				    number1 = "";
				    number2 = "";
				    result = 0;
			}
		}
		});
		panel.setLayout(null);
		frame.add(panel);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setSize(350, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		public double bo(String OPerator)
		{
			switch(OPerator)
			{
				case "+":
				result = add(number1, number2);	
				break;
				case "-":
				result = sub(number1, number2);		
				break;
				case "*":
				result = mul(number1, number2);		
				break;
				case "/":
				result = div(number1, number2);		
				break;
				default:
				System.out.println("Eneter an operator");

			}
			return result;

		}
		public static void main(String args[]){
		new cal();
		
		}
		public double add(String n1, String n2) {
			double r = 0.0;
			r = Double.parseDouble(n1) + Double.parseDouble(n2);
			return r;
		}
		public double sub(String n1, String n2) {
			double r = 0.0;
			r = Double.parseDouble(n1) - Double.parseDouble(n2);
			return r;
		}
		public double mul(String n1, String n2) {
			double r = 0.0;
			r = Double.parseDouble(n1) * Double.parseDouble(n2);
			return r;
		}
		public double div(String n1, String n2) {
			double r = 0.0;
			r = Double.parseDouble(n1) / Double.parseDouble(n2);
			return r;
	}

		
}