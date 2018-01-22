package ahlamproject;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.border.LineBorder;

import javafx.scene.shape.Box;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JProgressBar;

public class PizzaShop {

	private JFrame frame;

	
	
	public PizzaShop() {
		initializepizza();
	}

	
	private void initializepizza() {
		frame = new JFrame();
		frame.setBounds(100, 100, 470, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Pizza Shop");
		frame.getContentPane().setLayout(null);
		 
		ButtonGroup p=new ButtonGroup();
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel1.setBounds(10, 55, 135, 230);
		frame.getContentPane().add(panel1);
		
		JLabel label1 = new JLabel("Each Topping : 3NIS");
		label1.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel1.add(label1);
		
		JCheckBox tomato = new JCheckBox("Tomato              ");
		tomato.setFont(new Font("Tahoma", Font.BOLD, 13));
		tomato.setVerticalAlignment(SwingConstants.TOP);
		panel1.add(tomato);
		
		JCheckBox paper = new JCheckBox("Green Paper      ");
		paper.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel1.add(paper);
		
		JCheckBox olives = new JCheckBox("Black Olives       ");
		olives.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel1.add(olives);
		
		JCheckBox mush = new JCheckBox("Mushrooms       ");
		mush.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel1.add(mush);
		
		JCheckBox Cheese = new JCheckBox("Extra Cheese     ");
		Cheese.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel1.add(Cheese);
		
		JCheckBox Pepperoni = new JCheckBox("Pepperoni          ");
		Pepperoni.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel1.add(Pepperoni);
		
		JCheckBox sausage = new JCheckBox("Sausage            ");
		sausage.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel1.add(sausage);
		
		JPanel panel2 = new JPanel();
		panel2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel2.setBounds(165, 55, 135, 115);
		frame.getContentPane().add(panel2);
		
		JLabel label2 = new JLabel("Pizza Size             ");
		label2.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel2.add(label2);
		
		JRadioButton small = new JRadioButton("Small  :NIS 20     ");
		small.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel2.add(small);
		
		JRadioButton meddum = new JRadioButton("Medium : NIS 30 ");
		meddum.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel2.add(meddum);
		
		JRadioButton large = new JRadioButton("Large : NIS 45    ");
		large.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel2.add(large);
		
		JPanel panel3 = new JPanel();
		panel3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel3.setBounds(320, 55, 125, 115);
		frame.getContentPane().add(panel3);
		
		JLabel label3 = new JLabel("Pizza Type        ");
		label3.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel3.add(label3);
		
		JRadioButton thin = new JRadioButton("Thin Crust       ");
		thin.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel3.add(thin);
		
		JRadioButton medd = new JRadioButton("Medium Crust ");
		medd.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel3.add(medd);
		
		        
		JRadioButton pan = new JRadioButton("Pan                 ");
		pan.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel3.add(pan);
		
		p.add(thin);
		p.add(pan);
		p.add(medd);
		
		ButtonGroup g=new ButtonGroup();
		g.add(small);
		g.add(meddum);
		g.add(large);
		

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 350, 435, 80);
		frame.getContentPane().add(scrollPane);
		
		JTextArea text = new JTextArea();
		scrollPane.setViewportView(text);

		JButton process = new JButton("Process Selection");
		process.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 
				 String topping,size,type;
			        topping="";
			        type="";
			        size="";
			        
			        int total=0;
			        if(tomato.isSelected()){
			            total=total+3;
			            topping="   Tomatto   ";
			        } 
			        if(paper.isSelected()){
			            total=total+3;
			            topping=topping +"   Green Paper   ";
			        }

			        if(olives.isSelected()){
			            total+=3;
			           topping=topping +"   Black Olives    "; 
			        }
			         if(mush.isSelected()){
			            total+=3;
			            topping=topping +"   Muchrooms    ";
			        }
			         if(Cheese.isSelected()){
			            total+=3;
			            topping=topping +"   Extra Cheese    ";
			        }
			        if(Pepperoni.isSelected()){
			            total+=3;
			           topping=topping +"    Pepprone   "; 
			        }
			         if(sausage.isSelected()){
			            total+=3;
			          topping=topping +"    Sauusage   ";  
			        }
			        if(small.isSelected()){
			            total+=20;
			           size ="   Small   " ;
			        }
			        if(meddum.isSelected()){
			            total+=30;
			            size="   Medium   ";
			        }
			        if(large.isSelected()){
			            total+=45;
			            
			           size="    Large   " ;
			        }
			        if(thin.isSelected()){
			           type="   Thin Curst";
			         
			        }
			        
			        if(medd.isSelected()){
			            type="    Meduim Curst";  
			         
			        }
			         if(pan.isSelected()){
			        
			            type="   Pan   ";
			         }
			        
			        
					text.setText("Pizza Type : "+type+"\n"+"Pizza Size : "+size+"\n"+"Toppings : "+topping+"\n"+"Amount Total :  NIS  "+total);
		
			    }                                       

				
			
		});
		
		
		
		 
		        
		        
		        
		        
		        
		process.setFont(new Font("Tahoma", Font.BOLD, 13));
		process.setBounds(230, 180, 160, 30);
		frame.getContentPane().add(process);
		
		JLabel welcome = new JLabel("Welcome to Home Style Pizza Shop");
		welcome.setForeground(new Color(255, 0, 0));
		welcome.setBackground(new Color(255, 255, 255));
		welcome.setFont(new Font("Times New Roman", Font.BOLD, 23));
		welcome.setBounds(55, 10, 370, 45);
		frame.getContentPane().add(welcome);
		
		
		JLabel label4 = new JLabel("Your Order");
		label4.setFont(new Font("Tahoma", Font.BOLD, 12));
		label4.setBounds(210, 325, 90, 20);
		frame.getContentPane().add(label4);
		
		
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
					PizzaShop window = new PizzaShop();
					window.frame.setVisible(true);
				
			}
		});
	}
}
