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
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Point;

public class StickyNotes extends JFrame {
static int pX;
static int pY;
static int pointX;
static int pointY;
	private JPanel contentPane;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StickyNotes frame = new StickyNotes();
					frame.setUndecorated(true);
					 pointX=frame.getX();
					 pointY=frame.getY();
					
					frame.setLocation(pointX+100,pointY);
					frame.setVisible(true);
				   System.out.println(frame.getLocation()); 
					
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
		setAlwaysOnTop(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 230, 255);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		contentPane.setBackground(Color.BLACK);
		setContentPane(contentPane);
	
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(187, 2, 47, 38);
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
            
				dispose();
			
			}
		});
		contentPane.setLayout(null);
		btnNewButton.setBackground(new Color(249,233,148));
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon(StickyNotes.class.getResource("/images/icons8-close-window-24.png")));
		contentPane.add(btnNewButton);
		
		JButton button_1 = new JButton("");
		button_1.setBounds(0, 2, 39, 38);
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					StickyNotes newframe = new StickyNotes();
					newframe.setUndecorated(true);
					
					 pointX=newframe.getX();
					 pointY=newframe.getY();
					
					newframe.setLocation(pointX+100,pointY);
					newframe.setVisible(true);            
				
					
					
					newframe.addMouseMotionListener(new MouseAdapter() {
					   	public void mouseDragged(MouseEvent me) {
					   		newframe.getLocationOnScreen();
					   		newframe.setLocation(me.getXOnScreen(), me.getYOnScreen());
		
						 
						
						}
					});
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(rootPane, ex.getMessage());
				}
			}

			
		});
		button_1.setIcon(new ImageIcon(StickyNotes.class.getResource("/images/icons8-plus-24.png")));
		button_1.setBorder(null);
		button_1.setBackground(new Color(249,233,148));
		contentPane.add(button_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 40, 258, 255);

		scrollPane.setBackground(new Color(249,233,148));
		scrollPane.setBorder(null);
		contentPane.add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		textPane.setBorder(null);
		textPane.setBackground(new Color(249,233,148));
		scrollPane.setViewportView(textPane);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		textField.setBounds(37, 11, 156, 29);
        textField.setBackground(new Color(249,233,148));
        textField.setBorder(null);
        textField.setText("Untitled Note");
        
        
        
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		
	}
}
