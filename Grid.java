import java.awt.GridLayout;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class Grid extends JFrame {
	private JTextField[] tf = new JTextField[4];
	public Grid() {
		tf[0] = new JTextField(5);
		tf[1] = new JTextField(5);
		tf[2] = new JTextField(5);
		tf[3] = new JTextField(5);
		setLayout(new GridLayout(2,2));
		add(tf[0],0,0);
		add(tf[1],0,1);
		add(tf[2],1,0);
		add(tf[3],1,1);
		
		setTitle("Grid Layout");
		setVisible(true);
		setSize(new Dimension(500,500));
		setLocation(500,500);
	}
}
