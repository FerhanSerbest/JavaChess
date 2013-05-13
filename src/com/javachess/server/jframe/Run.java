package com.javachess.server.jframe;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


/**
*/
public class Run extends javax.swing.JFrame {
	private JPanel jPanel1;
	private JButton jButton1;
	private JLabel jLabel1;
	private JPanel jPanel3;
	private JPanel jPanel2;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Run inst = new Run();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				inst.setTitle("JavaChess Server");
				inst.setResizable(false);
			}
		});
	}
	
	public Run() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jPanel1 = new JPanel();
				getContentPane().add(jPanel1, BorderLayout.NORTH);
				jPanel1.setPreferredSize(new java.awt.Dimension(384, 100));
				{
					jLabel1 = new JLabel();
					jPanel1.add(jLabel1);
					jLabel1.setText("Welcome to JavaChess - Server");
				}
			}
			{
				jPanel2 = new JPanel();
				getContentPane().add(jPanel2, BorderLayout.SOUTH);
				jPanel2.setPreferredSize(new java.awt.Dimension(384, 74));
			}
			{
				jPanel3 = new JPanel();
				getContentPane().add(jPanel3, BorderLayout.CENTER);
				jPanel3.setPreferredSize(new java.awt.Dimension(384, 98));
				{
					jButton1 = new JButton();
					jPanel3.add(jButton1);
					jButton1.setText("Run my server !");
					jButton1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButton1ActionPerformed(evt);
						}
					});
				}
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void jButton1ActionPerformed(ActionEvent evt) {
		RunServer rs = new RunServer();
		this.setVisible(false);
	}

}
