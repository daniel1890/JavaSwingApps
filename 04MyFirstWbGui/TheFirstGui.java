import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class TheFirstGui extends JFrame 
{
	// Instantie variabelen
	JButton btnApply;
	JButton btnSubmit;
	
	public static void main(String[] args)
	{
		TheFirstGui g = new TheFirstGui();
	}
	
	public TheFirstGui() 
	{
		initComponents();
		createEvents();
	}


	// Initialiseer componenten en layout van de gui.
	
	private void initComponents() 
	{
		// Maak container en set de layout manager.
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		setTitle("My First Gui");
		c.setBackground(Color.YELLOW);
		
		// Creeër wat componenten.
		btnApply = new JButton("Apply");
		btnApply.setToolTipText("It's a button");
		btnApply.setBackground(Color.BLUE);
		btnApply.setForeground(Color.RED);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setEnabled(false);
		btnSubmit.setOpaque(false);
		
		// Voeg componenten toe aan de container.
		c.add(btnApply);
		c.add(btnSubmit);
		
		// Make sure frame closes when close is being pressed.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Set de display eigenschappen.
		setSize(600, 400);
		
		// Method to offset the location of the JFrame from the top-left corner (x = 0, y = 0) of the screen.
		setLocation(550, 300);
		
		// Make the JFrame and all components visible.
		setVisible(true);
	
	}

	private void createEvents() 
	{
		btnApply.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(null, "Congrats your first click!");
				btnSubmit.setEnabled(true);
			}
		});
		
		btnSubmit.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(null, "Unleashed!!", "ERROR", JOptionPane.ERROR_MESSAGE);		
			}
		});
		
	}
}
