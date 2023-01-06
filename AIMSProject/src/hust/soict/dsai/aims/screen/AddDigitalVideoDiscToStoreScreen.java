package hust.soict.dsai.aims.screen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.cart.Cart;

public class AddDigitalVideoDiscToStoreScreen extends AddItemToStoreScreen implements ActionListener  {
	
	JLabel lblTitle, lblCategory, lblDirector, lblLength, lblCost;
	JTextField txtTitle, txtCategory, txtDirector, txtLength, txtCost;
	JButton btnSubmit;
	
	public AddDigitalVideoDiscToStoreScreen(Store store, Cart cart) {
		super(store, cart, "Add DVD");
	}
	
	@Override
	public JPanel createCenter() {
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(6, 2));
		
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
		
		DigitalVideoDisc newDVD = new DigitalVideoDisc(title, category, cost, director, length);
		addItem(newDVD);
		
		txtTitle.setText("");
		txtCategory.setText("");
		txtDirector.setText("");
		txtLength.setText("");
		txtCost.setText("");
	}
}