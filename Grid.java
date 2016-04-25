import java.awt.GridLayout;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class Grid extends JFrame {
	private JTextField tf1,tf2,tf3,tf4;
	public Grid() {
		tf1 = new JTextField(5);
		tf2 = new JTextField(5);
		tf3 = new JTextField(5);
		tf4 = new JTextField(5);
		setLayout(new GridLayout(2,2));
		add(tf1,0,0);
		add(tf2,0,1);
		add(tf3,1,0);
		add(tf4,1,1);
		
		setTitle("Grid Layout");
		setVisible(true);
		setSize(new Dimension(500,500));
		setLocation(500,500);
	}
}