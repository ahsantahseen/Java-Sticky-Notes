import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;

public class window extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window frame = new window();
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
	public window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 761, 433);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(319, 52, 89, 111);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Sticky notes ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 24));
		lblNewLabel.setBounds(497, 38, 157, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblDevelopedByAhsan = new JLabel("Developed By Ahsan Tahseen");
		lblDevelopedByAhsan.setHorizontalAlignment(SwingConstants.CENTER);
		lblDevelopedByAhsan.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 21));
		lblDevelopedByAhsan.setBounds(418, 78, 327, 50);
		contentPane.add(lblDevelopedByAhsan);
		
		JLabel lblAlpha = new JLabel("1.0 Alpha");
		lblAlpha.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlpha.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 15));
		lblAlpha.setBounds(643, 11, 102, 39);
		contentPane.add(lblAlpha);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(4, 40, 311, 129);
		contentPane.add(panel);
		 panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 5, 301, 118);
		panel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setBackground(Color.WHITE);
	}
}
