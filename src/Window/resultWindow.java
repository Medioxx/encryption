package Window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class resultWindow extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5704212926769173079L;
	private JLabel text;
	
	
	public resultWindow(String windowName,String windowText) {
		super(windowName);
		setBounds(450, 450, 250, 150);
		text = new JLabel(windowText);
		text.setBounds(10, 10, 250, 10);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.add(text);
		add(panel);
		
	
	}
	
	
	@Override
	public void actionPerformed(ActionEvent evt) 
	{
		
	}

}
