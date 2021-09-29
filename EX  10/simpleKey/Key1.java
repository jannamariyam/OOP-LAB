/*========================================================================================================================================================
8. Develop a program to handle Key events.
=========================================================================================================================================================*/

import java.awt.*;
import java.awt.event.*;

public class Key1 extends Frame
implements KeyListener {

	String msg = "";
	String keyState = "";
	


	public Key1() {
		addKeyListener(this);
		addWindowListener(new MyWindowAdapter());
	}



								// Handle a key press.
	public void keyPressed(KeyEvent ke) {
		keyState = "Key Down";
		repaint();
	}




								// Handle a key release.
	public void keyReleased(KeyEvent ke) {
		keyState = "Key Up";
		repaint();
	}




								// Handle key typed.
	public void keyTyped(KeyEvent ke) {
		msg += ke.getKeyChar();
		repaint();
	}




								// Display keystrokes.
	public void paint(Graphics g) {
		g.setColor(Color.blue);
		g.drawString(keyState,200, 100);
		g.setColor(Color.red);
		g.drawString(msg, 20, 190);
	}



	public static void main(String[] args) {
		Key1 appwin = new Key1();

		appwin.setSize(new Dimension(500,300));
		appwin.setTitle("SimpleKey");
		appwin.setVisible(true);
	}
}

								// When the close box in the frame is clicked,
								// close the window and exit the program.
class MyWindowAdapter extends WindowAdapter {
		public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}
Send more screenshots
