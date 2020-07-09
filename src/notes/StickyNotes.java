package notes;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Transparency;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.*;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;

public class StickyNotes extends JFrame {

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
		contentPane.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, Color.GRAY));
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
		button_1.setBounds(6, 2, 24, 24);
		contentPane.add(button_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(StickyNotes.class.getResource("/images/ezgif.com-webp-to-png (3).png")));
		lblNewLabel.setBounds(-39,-31, 260, 280);
		contentPane.add(lblNewLabel);
	}
}
