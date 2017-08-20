package View;

import java.awt.*;
import javax.swing.*;

public class ButtonPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	
	// attributes
	private JLabel title;
	private JButton addNewCar;
	private JButton deleteCar;
	private JButton editCar;
	
	// constructor
	public ButtonPanel() {
		title = new JLabel("Button menu");
		addNewCar = new JButton("Add new car");
		deleteCar = new JButton("Delete car");
		editCar = new JButton("Edit car");
		
		setPreferredSize(new Dimension(700, 400));
		setLayout(new GridLayout(4,1));
		
		this.add(title);
		this.add(addNewCar);
		this.add(deleteCar);
		this.add(editCar);
	}

}
