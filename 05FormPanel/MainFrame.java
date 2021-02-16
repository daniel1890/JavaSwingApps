import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame {
	
	private TextPanel textPanel;
	private Toolbar toolbar;
	private FormPanel formPanel;
	
	public MainFrame() {
		super("Hello World");
		
		setLayout(new BorderLayout());
		
		toolbar = new Toolbar();
		textPanel = new TextPanel();
		formPanel = new FormPanel();
		
		toolbar.setStringListener(new StringListener() {
			public void textEmitted(String text) {
				textPanel.appendText(text);
			}
		});
		
		formPanel.setFormListener(new FormListener() {
			public void formEventOccurred(FormEvent e) {
				String name = e.getName();
				String occupation = e.getOccupation();
				
				textPanel.appendText(name + ": " + occupation + "\n");
			}
		});
		
		add(formPanel, BorderLayout.WEST);
		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		

		// Set size of window and make sure it closes when close is pressed by the user.
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/* Get the dimensions of the monitor of the user and split the width and height in half; afterwards, split the dimensions of the window in half and remove those of the previous amounts, this way
		 * this way the window get nicely centered.
		 */
		Dimension screenDim = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((screenDim.width / 2) - (this.getWidth() / 2), (screenDim.height / 2) - (this.getHeight() / 2));
		setVisible(true);
	}
}
