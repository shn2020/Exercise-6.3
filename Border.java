import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class Border extends JFrame {
	private JTextField[] tf = new JTextField[4];
	public Border() {
		tf[0] = new JTextField(10);
		tf[1] = new JTextField(10);
		tf[2] = new JTextField(10);
		tf[3] = new JTextField(10);
		setLayout(new BorderLayout());
		add(tf[0], BorderLayout.PAGE_START);
		add(tf[1], BorderLayout.PAGE_END);
		add(tf[2], BorderLayout.LINE_END);
		add(tf[3], BorderLayout.LINE_START);
		
		setTitle("Border Layout");
		setVisible(true);
		setSize(new Dimension(500,500));
		setLocation(0,0);
	}
}
