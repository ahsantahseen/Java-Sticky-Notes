package notes;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Transparency;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.*;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.ComponentInputMap;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;

public class StickyNotes extends JFrame {
static int pX;
static int pY;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StickyNotes frame = new StickyNotes();
					frame.setUndecorated(true);
					frame.setVisible(true);
				
					
					frame.addMouseMotionListener(new MouseAdapter() {
					   	public void mouseDragged(MouseEvent me) {
					   		frame.getLocationOnScreen();
					   		frame.setLocation(me.getXOnScreen(), me.getYOnScreen());
		
						 
						
						}
					});
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StickyNotes() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 190, 200);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		contentPane.setBackground(new Color(250, 240, 148));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
            
				dispose();
			
			}
		});
		btnNewButton.setBackground(new Color(249,233,148));
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon(StickyNotes.class.getResource("/images/icons8-close-window-24.png")));
		btnNewButton.setBounds(157, 2, 24, 24);
		contentPane.add(btnNewButton);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(StickyNotes.class.getResource("/images/icons8-plus-24.png")));
		button_1.setBorder(null);
		button_1.setBackground(new Color(249,233,148));
		button_1.setBounds(3, 2, 24, 24);
		contentPane.add(button_1);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(0, 24, 220, 137);
		editorPane.setBackground(null);
		contentPane.add(editorPane);
		
	
	
	}
}
