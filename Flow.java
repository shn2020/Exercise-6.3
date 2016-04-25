import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class Flow extends JFrame {
	private JTextField tf1,tf2,tf3,tf4;
	public Flow() {
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		tf3 = new JTextField(10);
		tf4 = new JTextField(10);
		setLayout(new FlowLayout());
		add(tf1);
		add(tf2);
		add(tf3);
		add(tf4);
		
		setTitle("Flow Layout");
		setVisible(true);
		setSize(new Dimension(500,500));
		setLocation(0,500);
	}
}