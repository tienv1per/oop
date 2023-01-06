package hust.soict.dsai.aims.screen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.LimitExceededException;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;

public class MediaStore extends JPanel {

	private Media media;
	
	public MediaStore(Media media, Cart cart) {
		this.media = media;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JLabel title = new JLabel(media.getTitle());
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
		title.setAlignmentX(CENTER_ALIGNMENT);
		
		JLabel cost = new JLabel(""+media.getCost()+"$");
		cost.setAlignmentX(CENTER_ALIGNMENT);
		
		JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JButton addCartBtn = new JButton("Add to Cart");
		addCartBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Add to Cart successfully!");
				try {
					cart.addMedia(media);
				} catch (LimitExceededException e1) {
					e1.printStackTrace();
				}
			}
		});
		container.add(addCartBtn);
		
		
		if (media instanceof Playable) {
			JButton playBtn = new JButton("Play");
			playBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JDialog playDialog = new JDialog();
					JPanel mainGui = new JPanel(new BorderLayout());
			        mainGui.setBorder(new EmptyBorder(20, 20, 20, 20));
			        mainGui.add(new JLabel("Playing....."), BorderLayout.CENTER);
			        JPanel buttonPanel = new JPanel(new FlowLayout());
			        mainGui.add(buttonPanel, BorderLayout.SOUTH);
			        JButton close = new JButton("Stop");
			        close.addActionListener(ev->playDialog.setVisible(false));
			        buttonPanel.add(close);
			        playDialog.setContentPane(mainGui);
			        playDialog.setLocationRelativeTo(playBtn);
			        playDialog.pack();
			        playDialog.setVisible(true);
				}
			});
			container.add(playBtn);
		}
		
		this.add(Box.createVerticalGlue());
		this.add(title);
		this.add(cost);
		this.add(Box.createVerticalGlue());
		this.add(container);
		
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
	}

}