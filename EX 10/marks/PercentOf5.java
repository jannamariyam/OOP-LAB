/*======================================================================================================================================================
4.Find the percentage of marks obtained by a student in 5 subjects.Display a happy face if he secures above 50% or a sad face if otherwise.
===================================================================================================================================================*/
import java.awt.*;
import java.awt.event.*;

public class PercentOf5 extends Frame
implements ActionListener {
     TextField T1,T2,T3,T4,T5;
      int a,b,c,d,e;
      double sum,percent;
      Button percentage;
      
      public PercentOf5() {
		// Use a flow layout.
		setLayout(new FlowLayout());

		// Create controls.
		Label E = new Label("English: ",Label.LEFT);
		Label M = new Label("Maths: ",Label.LEFT);
		Label C = new Label("Chemistry ",Label.LEFT);
		Label P = new Label("Physics: ",Label.LEFT);
		Label B = new Label("Biology: ",Label.LEFT);
		T1 = new TextField(10);
		T2 = new TextField(10);
		T3 = new TextField(10);
		T4 = new TextField(10);
		T5 = new TextField(10);

		// Create button.
		percentage = new Button("percentage");

		// Add the controls to the frame.
		add(E);
		add(T1);
		add(M);
		add(T2);
		add(C);
		add(T3);
		add(P);
		add(T4);
		add(B);
		add(T5);
		add(percentage);

		// Add action event handlers.
		T1.addActionListener(this);
		T2.addActionListener(this);
		T3.addActionListener(this);
		T4.addActionListener(this);
		T5.addActionListener(this);


		// Add action listeners for the button.
		percentage.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
			System.exit(0);
			}
		});
	}

public void actionPerformed(ActionEvent ae) {
		
             	String str = ae.getActionCommand();
		if(str.equals("percentage")){

             		a=Integer.parseInt(T1.getText());
		b=Integer.parseInt(T2.getText());
	        	c=Integer.parseInt(T3.getText());
		d=Integer.parseInt(T4.getText());
		e=Integer.parseInt(T5.getText());
  
		/* Calculate sum, percentage */
    		sum = a+b+c+d+e;
    		percent =(sum * 100.00) / 500.00 ;
		
	      	repaint();
	
		
	      }
	}
	public void paint(Graphics g) {
		g.drawString("sum is : "+String.valueOf(sum),10,140);
		g.drawString("percentage  is : "+String.valueOf(percent),10,160);
              

	
	if(percent<=50.0)
		{									//sad face for percentage <= 50
			g.setColor(Color.red);
			g.fillOval(250, 200, 150, 150);
  
        		// Ovals for eyes
       	  		// with black color filled
        		g.setColor(Color.BLACK);
        		g.fillOval(290, 250, 15, 15);
        		g.fillOval(340, 250, 15, 15);
  
        		// Arc for the sad
        		g.drawArc(310, 300, 35, 35, 20, 150);
							
		}
		else									//happy face for percentage >50									
		{	
			g.setColor(Color.yellow);
			g.fillOval(250, 200, 150, 150);
  
  
        		// Ovals for eyes
       	  		// with black color filled
        		g.setColor(Color.BLACK);
        		g.fillOval(290, 250, 15, 15);
        		g.fillOval(340, 250, 15, 15);
        		
        		
			// Arc for the smile
        		g.drawArc(305, 300, 35, 15, 180, 180);
		
		}
		
	}
	
              
      


	public static void main(String[] args) {
		PercentOf5 appwin = new PercentOf5();
		appwin.setSize(new Dimension(540, 360));
		appwin.setTitle("PercentOf5Nmbrs");
		appwin.setVisible(true);

      }
}
	



	
       