package _11_binary_converter;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {

	JFrame window = new JFrame();
	JPanel solar = new JPanel();
	JLabel sign = new JLabel();
	JTextField text = new JTextField(20);
	JButton button = new JButton();
	void base() {
		
		
		
		
		solar.add(text);
		window.add(solar);
		window.setVisible(true);
		button.setText("click me!");
		button.addActionListener(this);
		solar.add(button);
		solar.add(sign);
		window.pack();
		window.setTitle("Binary Converter");
		
	
		
		
	}
	
	
	String convert(String input) {
		if(input.length() != 8){
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return "-";
		}
		String binary = "[0-1]+";//must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";   
		}
		try {
			int asciiValue = Integer.parseInt(input, 2);
			char theLetter = (char) asciiValue;
			return "" + theLetter;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		String binaryString = text.getText();
		String letter = convert(binaryString);
		sign.setText(letter);
		window.pack();
	}
	

}




