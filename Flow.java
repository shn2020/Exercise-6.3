import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class Flow extends JFrame {
	private JTextField[] tf = new JTextField[4];
	public Flow() {
		tf[0] = new JTextField(10);
		tf[1] = new JTextField(10);
		tf[2] = new JTextField(10);
		tf[3] = new JTextField(10);
		setLayout(new FlowLayout());
		add(tf[0]);
		add(tf[1]);
		add(tf[2]);
		add(tf[3]);
		
		setTitle("Flow Layout");
		setVisible(true);
		setSize(new Dimension(500,500));
		setLocation(0,500);
	}
}
