import javax.swing.JButton;
import javax.swing.JFrame;

public class JavaGUI
{
	JFrame frame = new JFrame("frame");
	JButton button = new JButton("button");

	public void createFrame()
	{

		frame.add(button);


		frame.setSize(300, 600);


		frame.setVisible(true);


		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args)
	{

		JavaGUI javaGUI = new JavaGUI();
		javaGUI.createFrame();
	}
}

