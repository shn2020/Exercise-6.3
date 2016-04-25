import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class Border extends JFrame {
	private JTextField tf1,tf2,tf3,tf4;
	public Border() {
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		tf3 = new JTextField(10);
		tf4 = new JTextField(10);
		setLayout(new BorderLayout());
		add(tf1, BorderLayout.PAGE_START);
		add(tf2, BorderLayout.PAGE_END);
		add(tf3, BorderLayout.LINE_END);
		add(tf4, BorderLayout.LINE_START);
		
		setTitle("Border Layout");
		setVisible(true);
		setSize(new Dimension(500,500));
		setLocation(0,0);
	}
}