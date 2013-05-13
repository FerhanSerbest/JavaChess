package com.javachess.client.jframe;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import com.javachess.client.action.CloseJFrame;
import com.javachess.client.sql.Connect;


/**

*/
public class Intro extends javax.swing.JFrame {
	private JPanel jPanel1;
	private JLabel jLabel3;
	private JButton jButton1;
	private JButton jButton3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JPasswordField jPasswordField1;
	private JTextField jTextField3;
	private JButton jButton2;
	private JTextField jTextField1;
	private JLabel jLabel2;
	private JPanel jPanel3;
	private JPanel jPanel2;
	private JLabel jLabel1;

	/**
	
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Intro inst = new Intro();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				inst.setTitle("Welcome to JavaChess");
				inst.setResizable(true);
			}
		});
	}
	
	public Intro() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jPanel1 = new JPanel();
				FlowLayout jPanel1Layout = new FlowLayout();
				getContentPane().add(jPanel1, BorderLayout.NORTH);
				jPanel1.setLayout(jPanel1Layout);
				jPanel1.setPreferredSize(new java.awt.Dimension(684, 116));
				{
					jLabel1 = new JLabel();
					jPanel1.add(jLabel1);
					jLabel1.setText("Welcome to JavaChess Game");
					jLabel1.setPreferredSize(new java.awt.Dimension(170, 50));
				}
			}
			{
				jPanel2 = new JPanel();
				GridBagLayout jPanel2Layout = new GridBagLayout();
				getContentPane().add(jPanel2, BorderLayout.SOUTH);
				jPanel2.setPreferredSize(new java.awt.Dimension(684, 146));
				jPanel2Layout.rowWeights = new double[] {0.1, 0.1, 0.1, 0.1};
				jPanel2Layout.rowHeights = new int[] {7, 7, 7, 7};
				jPanel2Layout.columnWeights = new double[] {0.1, 0.1, 0.0, 0.1, 0.1};
				jPanel2Layout.columnWidths = new int[] {7, 7, 17, 7, 7};
				jPanel2.setLayout(jPanel2Layout);
				{
					jButton1 = new JButton();
					jPanel2.add(jButton1, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jButton1.setText("Connect");
					jButton1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButton1ActionPerformed(evt);
						}
					});
				}
				{
					jButton2 = new JButton();
					jPanel2.add(jButton2, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jButton2.setText("Exit");
					jButton2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButton2ActionPerformed(evt);
						}
					});
				}
				{
					jLabel4 = new JLabel();
					jPanel2.add(jLabel4, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jLabel4.setText("New Player?");
				}
				{
					jButton3 = new JButton();
					jPanel2.add(jButton3, new GridBagConstraints(3, 2, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jButton3.setText("Create your account here!");
					jButton3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButton3ActionPerformed(evt);
						}
					});
				}
			}
			{
				jPanel3 = new JPanel();
				GridBagLayout jPanel3Layout = new GridBagLayout();
				jPanel3Layout.columnWidths = new int[] {7, 14, 156, 20};
				jPanel3Layout.rowHeights = new int[] {7, 7, 7, 20};
				jPanel3Layout.columnWeights = new double[] {0.1, 0.0, 0.0, 0.1};
				jPanel3Layout.rowWeights = new double[] {0.1, 0.1, 0.1, 0.1};
				getContentPane().add(jPanel3, BorderLayout.CENTER);
				jPanel3.setLayout(jPanel3Layout);
				jPanel3.setPreferredSize(new java.awt.Dimension(684, 400));
				{
					jLabel2 = new JLabel();
					jPanel3.add(jLabel2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jLabel2.setText("Username:");
				}
				{
					jLabel3 = new JLabel();
					jPanel3.add(jLabel3, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jLabel3.setText("Password:");
				}
				{
					jTextField1 = new JTextField();
					jPanel3.add(jTextField1, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
				}
				{
					jLabel5 = new JLabel();
					jPanel3.add(jLabel5, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jLabel5.setText("Server address:");
				}
				{
					jTextField3 = new JTextField();
					jPanel3.add(jTextField3, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
				}
				{
					jPasswordField1 = new JPasswordField();
					jPanel3.add(jPasswordField1, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
				}
			}
			pack();
			setSize(700, 700);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void jButton2ActionPerformed(ActionEvent evt) {
		CloseJFrame cj = new CloseJFrame(this);
	}
	
	private void jButton1ActionPerformed(ActionEvent evt) {
		/**
		 * TODO: handler method for connecting to SQL DB and going to Info.java
		 */
		char[] pass = jPasswordField1.getPassword();  
		String passString = new String(pass);
		Connect c = new Connect(jTextField1.getText(), passString,jTextField3.getText() );
		this.setVisible(false);
	}
	
	private void jButton3ActionPerformed(ActionEvent evt) {
		this.setVisible(false);
		Create cr = new Create();
		
	}

}
