import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Exam extends JFrame implements ActionListener
{
	JButton btn, btn1;
	JLabel l;
	ButtonGroup g;
	int m[]=new int[10];
	JRadioButton radioButton[]=new JRadioButton[5];
	int current=0, count=0, x=1,y=1,now=0;
	
	Exam(String s)
	{
		super(s);
		l=new JLabel();
		add(l);
		g=new ButtonGroup();
		
		for(int i=0; i<5; i++)
		{
			radioButton[i]=new JRadioButton();
			add(radioButton[i]);
			g.add(radioButton[i]);
		}
		btn=new JButton("next qustion");
		btn1=new JButton("Bookmark qustion");
		btn.addActionListener(this);
		btn1.addActionListener(this);
		add(btn);
		add(btn1);
		set();
		l.setBounds(30,40,450,20);
		radioButton[0].setBounds(50,80,450,20);
		radioButton[1].setBounds(50,110,200,20);
		radioButton[2].setBounds(50,140,200,20);
		radioButton[3].setBounds(50,170,200,20);
		btn.setBounds(100,240,150,30);
		btn1.setBounds(270,240,200,30);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250,100);
		setVisible(true);
		setSize(700,600);
		/*Color c=new Color(225,125,0);
		getContentPane().setBackground(c);*/
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btn)
		{
			if(qcheck())
				count=count+1;
			current++;
			set();
			if(current==14)
			{
				btn.setEnabled(false);
				btn1.setText("Result");
		}}
		if(e.getActionCommand().equals("Bookmark qustion"))
		{
			JButton bk=new JButton("bookmark"+x);
			bk.setBounds(480,20+30*x,150,30);
			add(bk); 
			bk.addActionListener(this);
			m[x]=current;
			x++;
			current++;
			set();
			if(current==14)
				btn1.setText("Score");
			setVisible(false);
			setVisible(true);
		}
		for(int i=0,y=1; i<x;i++,y++)
		{
			if(e.getActionCommand().equals("Bookmark"+y))
			{
				if(qcheck())
					count=count+1;
				now=current; current=m[y]; set();
				((JButton)e.getSource()).setEnabled(false);
				current=now;
		}}
		if(e.getActionCommand().equals("Result"))
		{
			if(qcheck())
				count=count+1; current++;
			JOptionPane.showMessageDialog(null,"you have correct answerd"+" \n" +  count  +"\n");
			System.exit(0);
	}}
	void set()
	{
		radioButton[4].setSelected(true);
		if(current==0)
		{
			l.setText("Que1: who invented C++?");
			radioButton[0].setText("Dennis Ritchie");
			radioButton[1].setText("Ken Thompson");
			radioButton[2].setText("Brian");
			radioButton[3].setText("Bjarne");
		}
		if(current==1)
		{
			l.setText("Que2: Which concept allows you to reuse the writen code?");
			radioButton[0].setText("Encapsulation");
			radioButton[1].setText("Abstraction");
			radioButton[2].setText("Inheritance");
		radioButton[3].setText("Polymorphism");
		}
			if(current==2)
			{
				l.setText("Que3: Which of the following user-defined header file extension used in c++?");
				radioButton[0].setText("hg");
			radioButton[1].setText("cpp");
			radioButton[2].setText("h");
			radioButton[3].setText("hf");}
			if(current==3)
			{
			l.setText("Que4: Wrapping data and its related functionallity into a single entity is known as_____");
			radioButton[0].setText("Encapsulation");
			radioButton[1].setText("Abstraction");
			radioButton[2].setText("Inheritance");
			radioButton[3].setText("Polymorphism");}
			if(current==4)
			{
				l.setText("Que5: Which of the following correctly declares an array in C++?");
			radioButton[0].setText("array[10]");
			radioButton[1].setText("array array[10]");
			radioButton[2].setText("int array");
			radioButton[3].setText("int array[10]");
			}
			if(current==5)
			{
			l.setText("Que6: Which of the following is s correct identifier in C++?");
			radioButton[0].setText("VAr_1234");
			radioButton[1].setText("$var_name");
			radioButton[2].setText("VARNAME");
			radioButton[3].setText("7var_name");
			}
			if(current==6)
			{
			l.setText("Que7: Who invented java Programming?");
			radioButton[0].setText("Guido van Rossum");
			radioButton[1].setText("James Gosling");
			radioButton[2].setText("Dennis Ritchie");
			radioButton[3].setText("Bjane Stroustrup");
			}
			if(current==7)
			{
			l.setText("Que8:Which one of the following is not a java feature?");
			radioButton[0].setText("Object-oriented");
			radioButton[1].setText("use of pointers");
			radioButton[2].setText("protable");
			radioButton[3].setText("Dynamic and Extensible");
			}
			if(current==8)
			{
			l.setText("Que9: What is the extension of java code files?");
			radioButton[0].setText(".js");
			radioButton[1].setText(".txt");
			radioButton[2].setText(".class");
			radioButton[3].setText(".java");
			}
			if(current==9)
			{
			l.setText("Que10: Which of the following is not an OOPs concept in java?");
			radioButton[0].setText("polymorphism");
			radioButton[1].setText("inheritance");
			radioButton[2].setText("compilation");
			radioButton[3].setText("Encapsulation");
			}
			if(current==10)
			{
			l.setText("Que11: Which of these are selection statements in java?");
			radioButton[0].setText("break");
			radioButton[1].setText("continue");
			radioButton[2].setText("for()");
			radioButton[3].setText("if()");
			}
			if(current==11)
			{
			l.setText("Que12: Which of these keywords is used to define interfaces in java?");
			radioButton[0].setText("intf");
			radioButton[1].setText("Intf");
			radioButton[2].setText("interface");
			radioButton[3].setText("Interface");
			}
			if(current==12)
			{
			l.setText("Que13:Which of the below is not a java Profiler?");
			radioButton[0].setText("jProfiler");
			radioButton[1].setText("Eclipse Profiler");
			radioButton[2].setText("jvm");
			radioButton[3].setText("jConsole");
			}
			if(current==13)
			{
			l.setText("Que14: Which of these package contains the exception Stack Overflow in java?");
			radioButton[0].setText("java.io");
			radioButton[1].setText("java.system");
			radioButton[2].setText("java.lang");
			radioButton[3].setText("java.util");
			}
			if(current==14)
			{
			l.setText("Que15: Evaluate the following java expression ,if x=3,y=5,and z=10 ..... ++z+y-y+zx++");
			radioButton[0].setText("24");
			radioButton[1].setText("23");
			radioButton[2].setText("20");
			radioButton[3].setText("25");
			}
			
			l.setBounds(30,40,450,20);
			for(int i=0, j=0; i<=90; i+=30,j++)
				radioButton[j].setBounds(50,80+i,200,20);
			}
				
				boolean qcheck()
				{
					if(current==0)
						return(radioButton[3].isSelected());
					if(current==1)
						return(radioButton[2].isSelected());
					if(current==2)
						return(radioButton[2].isSelected());
					if(current==3)
						return(radioButton[1].isSelected());
					if(current==4)
						return(radioButton[3].isSelected());
					if(current==5)
						return(radioButton[2].isSelected());
					if(current==6)
						return(radioButton[1].isSelected());
					if(current==7)
						return(radioButton[1].isSelected());
					if(current==8)
						return(radioButton[3].isSelected());
					if(current==9)
						return(radioButton[2].isSelected());
					if(current==10)
						return(radioButton[3].isSelected());
					if(current==11)
						return(radioButton[4].isSelected());
					if(current==12)
						return(radioButton[3].isSelected());
					if(current==13)
						return(radioButton[2].isSelected());
					if(current==14)
						return(radioButton[3].isSelected());
					
					return false;
				}
				public static void main(String[] args)
				{
					new Exam("Online Exam Portal");
}}





		