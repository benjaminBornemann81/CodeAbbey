package Pack1;

import javax.swing.*;

public class FrameTest {
	JButton button;
	JFrame frame = new JFrame();
	
	public static void main(String[] args) {
		FrameTest gui = new FrameTest();
		gui.los();
	}	
	
	public void los() {
		button = new JButton("Button Text");
		button.addActionListener(event -> button.setText("Ich wurde geklickt!"));
		frame.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
}


