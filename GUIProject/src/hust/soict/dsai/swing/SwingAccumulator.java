package hust.soict.dsai.swing;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingAccumulator extends JFrame{
	private JTextField tfInput;
	private JTextField tfOutput;
	private int sum = 0;
	
	public SwingAccumulator() {
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(2, 2));
		
		cp.add(new JLabel("Enter an Integer: "));
		
		tfInput = new JTextField(10);
		cp.add(tfInput);
		tfInput.addActionListener(new TFInputListener());
		
		cp.add(new JLabel("The Accumulated Sum is: "));
		
		tfOutput = new JTextField(10);
		tfOutput.setEditable(false);
		cp.add(tfOutput);
		
		setTitle("Swing Accumulator");
		setSize(350, 120);
		setVisible(true);
	}
	
	private class TFInputListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent evt) {
			int numberIn = Integer.parseInt(tfInput.getText());
			sum += numberIn;
			tfInput.setText("");
			tfOutput.setText(sum+"");
		}
	}
	
	public static void main(String[] args) {
		new SwingAccumulator();
	}

}