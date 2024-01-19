import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Face implements  ActionListener {
	
	private static JFrame frame;
	private static JPanel panel;
	private static JLabel usernameLabel;
	private static JTextField usernameText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel imageLabel;
	private static Icon image;
//	private static Dimension size;
	
	public Face() {
		
		frame = new JFrame();
		frame.setSize(300, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		frame.add(panel);
		
		panel.setLayout(null);
		
		usernameLabel = new JLabel("Username");
		usernameLabel.setBounds(10, 20, 80, 25);
		panel.add(usernameLabel);
		
		usernameText = new JTextField(20);
		usernameText.setBounds(100, 20, 165, 25);
		panel.add(usernameText);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
				
		button = new JButton("Enter");
		button.setBounds(90, 90, 80, 25);
		button.addActionListener(this);
		panel.add(button);
		
		image = new ImageIcon("DaddyBirthday.jpg");
		imageLabel = new JLabel("Daddy");
		imageLabel.setIcon(image);
		panel.add(imageLabel);
		
		
		
		
		frame.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String username = usernameText.getText();
		String password = passwordText.getText();
		
		if(username.equalsIgnoreCase("Raja") && password.equalsIgnoreCase("Brithday")) {
			System.out.println("HAPPY BIRTHDAY!!");
		}
			
	} 

	
	
	public static void main(String[] args) {
		Face f1 = new Face();
	}

	

}
