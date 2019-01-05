/* A java class that uses JFrame and JLabel for simple display output. */

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel; 

public class ObjectClass extends JFrame{
	
	private JLabel item1;
	
	public ObjectClass() {
		super("The title bar");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("My Output Here");
		item1.setToolTipText("This is Hover");
		add(item1);
	}
	
}
