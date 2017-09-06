package Window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Main.openfile;
import Ciphers.*;

public class mainWindow extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton crypto;
	private JTextArea path; 
	
	public mainWindow() 
	{
		super("Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,400,270);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel text = new JLabel("Please add whole path to text file");
		text.setBounds(10, 10, 270, 10);
		path = new JTextArea("C:\\Users\\marek\\Desktop");
		path.setBounds(10, 45, 270, 20);
		
		JComboBox<String> choose = new JComboBox<String>();
		choose.setBounds(10, 85, 200, 20);
		choose.addItem("Ceaser");
		choose.addItem("whatever");
		this.crypto = new JButton("Start Cryptology");
		this.crypto.setBounds(10, 150, 220, 20);
		this.crypto.addActionListener(this);
		
		panel.add(choose);
		panel.add(this.crypto);
		panel.add(text);
		panel.add(path);
		add(panel);
		
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent evt) 
	{
		if(evt.getSource()==this.crypto) 
		{
			openfile file = new openfile(path.getText());
			Caesar code= new Caesar(file.getText(), 5);
			file.writeText(code.code());
			
		}
	}
	
	

}
