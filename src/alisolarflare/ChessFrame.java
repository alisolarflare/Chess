package alisolarflare;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChessFrame extends JFrame {
	private static final long serialVersionUID = -8263267431020862879L;

	public ChessFrame(){
		init();
		
		//Creates a JPanel containing buttons
		int buttonAmount = 14;
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		JButton[] buttonArray = new JButton[buttonAmount];
		for (int i = 0; i < buttonAmount; i++){
			buttonArray[i] = new JButton("Num " + (i + 1));
			buttonPanel.add(buttonArray[i]);
		}
		
		
		//Adds Buttons
		add(new JButton("Button Number EAST"), BorderLayout.EAST);
		add(new JButton("Button Number WEST"), BorderLayout.WEST);
		add(new ChessComponent(), BorderLayout.CENTER);
		
		
		setVisible(true);
	}
	
	public void init(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640, 480);
		setVisible(true);
		setLayout(new BorderLayout());
	}
	
	
}
