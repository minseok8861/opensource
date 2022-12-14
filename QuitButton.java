import java.awt.event.*;
import javax.swing.*;

public class QuitButton extends JButton implements ActionListener {
	
	public QuitButton() {
		super("Quit");
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
