import java.awt.*;
import java.awt.event.*;

class Choice1 extends Frame
implements ItemListener {
	Choice s;
	String msg = "";

	public Choice1() {

						// Use a flow layout.
		setLayout(new FlowLayout());
						// Create choice lists.
		s = new Choice();


						// Add items to Shapes list.
		s.add("Circle");
		s.add("Triangle");
		s.add("Rectangle");
		s.add("Square");


						// Add choice lists to window.
		add(s);


						// Add item listeners.
		s.addItemListener(this);


		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	public void itemStateChanged(ItemEvent ie) {
		repaint();
	}

						// Display current selections.
	public void paint(Graphics g) {

		String ch=s.getSelectedItem();
		switch(ch){
			case "Circle":   g.fillOval(60,120,60,60);	//fill an ellipse with parameter for top,left,width and height
					 break;

			case "Triangle": g.drawLine(120,130,280,130);  //draw a triangle
        				 g.drawLine(120,130,200,70);
        				 g.drawLine(200,70,280,130);
					 break;

			case "Rectangle":g.fillRect(150, 170, 70, 90); 	//filled rectangle method with parameter for top,left,width and height
					 break;

			case "Square":   g.fillRect(75,75,75,75); 	//filled rectangle method with parameter for top,left,width and height
					 break;

		}
	}
	public static void main(String[] args) {
		Choice1 appwin = new Choice1();

		appwin.setSize(new Dimension(240, 180));
		appwin.setTitle("Choice1");
		appwin.setVisible(true);
	}
}
Verified
