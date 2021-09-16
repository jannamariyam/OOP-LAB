/*==================================================================================================================================================
Program to draw Circle, Rectangle, Line
====================================================================================================================================================*/

import java.awt.*;
import java.awt.event.*;

public class AWTShapes extends Frame {

public AWTShapes() {
addWindowListener(new WindowAdapter() {  		// Anonymous inner class to handle window close events.
public void windowClosing(WindowEvent we) {
System.exit(0);
}
});
}

												// Draw in different colors.
public void paint(Graphics g) {

Color c1 = new Color(100, 255, 100);;
g.setColor(c1);
g.drawLine(90, 90, 200, 70); 					//draw a line with parameter for startX,startY,endX and endY
g.setColor(Color.pink);
g.fillOval(100, 100, 100, 100); 				//fill an ellipse with parameter for top,left,width and height
g.setColor(Color.cyan);
g.fillRect(70, 260, 100, 90); 					//filled rectangle method with parameter for top,left,width and height
}
public static void main(String[] args) {
AWTShapes appwin = new AWTShapes();

appwin.setSize(new Dimension(340, 260));    	//to set the size of frame
appwin.setVisible(true);                    	//to set the frame visibility true
}
}
Verified
