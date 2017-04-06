package tw.brad;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Choosefile extends JFrame{
	private JButton open, save, exit;
	Choosefile() {
	
		super("視窗程式");
		setLayout(new FlowLayout());
		open =new JButton("Open");
		save =new JButton("Save");
		exit =new JButton("Exit");
		add(open);add(save);add(exit);
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
	new Choosefile();
	}
}
