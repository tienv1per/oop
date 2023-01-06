package hust.soict.dsai.aims.screen;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.cart.Cart;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen implements ActionListener  {
	
	JLabel lblTitle, lblCategory, lblDirector, lblLength, lblCost, lblArtist, lblTrack;
	JTextField txtTitle, txtCategory, txtDirector, txtLength, txtCost, txtArtist, txtTrack;
	JButton btnSubmit;
	JPanel center;
	
	CompactDisc inputCD = new CompactDisc();
	
	public AddCompactDiscToStoreScreen(Store store, Cart cart) {
		super(store, cart, "Add CD");
	}
	
	@Override
	public JPanel createCenter() {
		center = new JPanel();
		center.setLayout(new GridLayout(8, 2));
		
		lblTitle = new JLabel("Enter Title:");
	    txtTitle = new JTextField();
		lblCategory = new JLabel("Enter Category:");
	    txtCategory = new JTextField();
		lblDirector = new JLabel("Enter Director:");
	    txtDirector = new JTextField();
		lblLength = new JLabel("Enter Length:");
	    txtLength = new JTextField();
		lblCost = new JLabel("Enter Cost:");
	    txtCost = new JTextField();
	    lblArtist = new JLabel("Enter Artist:");
	    txtArtist = new JTextField();
	    lblTrack = new JLabel("Enter num of Tracks:");
	    txtTrack = new JTextField();
		
	    center.add(lblTitle);
	    center.add(txtTitle);
	    center.add(lblCategory);
	    center.add(txtCategory);
	    center.add(lblDirector);
	    center.add(txtDirector);
	    center.add(lblLength);
	    center.add(txtLength);
	    center.add(lblCost);
	    center.add(txtCost);
	    center.add(lblArtist);
	    center.add(txtArtist);
	    center.add(lblTrack);
	    center.add(txtTrack);
		
		setSize(600, 300);
		setVisible(true);
		btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(this);
		
		center.add(btnSubmit);
		return center;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		String title = txtTitle.getText();
		String category = txtCategory.getText();
		String director = txtDirector.getText();
		int length = Integer.parseInt(txtLength.getText());
		float cost = Float.parseFloat(txtCost.getText());
		String artist = txtArtist.getText();
		int numsOfTracks = Integer.parseInt(txtTrack.getText());
		
		inputCD.setTitle(title);
		inputCD.setCategory(category);
		inputCD.setDirector(director);
		inputCD.setLength(length);
		inputCD.setCost(cost);
		inputCD.setArtist(artist);
		
		ArrayList<Track> trackInput = new ArrayList<Track>();
		JTextField trackTitle = new JTextField();
		JTextField trackLength = new JTextField();
		for(int i = 0; i < numsOfTracks; ++i) {
			JComponent[] inputs = new JComponent[] {
			        new JLabel("Track title"),
			        trackTitle,
			        new JLabel("Track length"),
			        trackLength
			};
			int result = JOptionPane.showConfirmDialog(null, inputs, "Input track " + (i + 1), JOptionPane.PLAIN_MESSAGE);
			if (result == JOptionPane.OK_OPTION) {
				trackInput.add(new Track(trackTitle.getText(), Integer.parseInt(trackLength.getText())));
			} else {
			    System.out.println("Input track " + (i + 1) + "cancel!!");
			}
			
			trackTitle.setText("");
			trackLength.setText("");
		}
		
        
		inputCD.setTracks(trackInput);
		
		addItem(inputCD);

		txtTitle.setText("");
		txtCategory.setText("");
		txtDirector.setText("");
		txtLength.setText("");
		txtCost.setText("");
		txtArtist.setText("");
		txtTrack.setText("");
		
	}
}