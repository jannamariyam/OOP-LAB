/*======================================================================================================================================================
3. Program to find maximum of three numbers using AWT.
===================================================================================================================================================*/
import java.awt.*;
import java.awt.event.*;

public class MaxOf3Nmbrs extends Frame
implements ActionListener {
     TextField T1,T2,T3;
      int a,b,c,max;
      Button maximum;
      
      public MaxOf3Nmbrs() {
		// Use a flow layout.
		setLayout(new FlowLayout());

		// Create controls.
		Label f = new Label("First Number: ",Label.LEFT);
		Label s = new Label("Second Number: ",Label.LEFT);
		Label t = new Label("Third Number: ",Label.LEFT);
		T1 = new TextField(10);
		T2 = new TextField(10);
		T3 = new TextField(10);

		// Create button.
		maximum = new Button("Maximum");

		// Add the controls to the frame.
		add(f);
		add(T1);
		add(s);
		add(T2);
		add(t);
		add(T3);
		add(maximum);

		// Add action event handlers.
		T1.addActionListener(this);
		T2.addActionListener(this);
		T3.addActionListener(this);

		// Add action listeners for the button.
		maximum.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
			System.exit(0);
			}
		});
	}

public void actionPerformed(ActionEvent ae) {
		
             	String str = ae.getActionCommand();
		if(str.equals("Maximum")){

             		a=Integer.parseInt(T1.getText());
		b=Integer.parseInt(T2.getText());
	        	c=Integer.parseInt(T3.getText());
 
      
               if (a > b && a > c) {
         
                      max=a;
		}
               else if(b > a && b > c) {
                      max=b;
                }
            
               else{
                      max=c;
              }
	  
	      repaint();
	      }
	}
	public void paint(Graphics g) {
		g.drawString("Maximum Number is : "+String.valueOf(max),10,120);
              

	}

	public static void main(String[] args) {
		MaxOf3Nmbrs appwin = new MaxOf3Nmbrs();
		appwin.setSize(new Dimension(420, 200));
		appwin.setTitle("MaximumOf3Numbrs");
		appwin.setVisible(true);
	}
}
	
   Verified    
