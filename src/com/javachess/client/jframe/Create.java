package com.javachess.client.jframe;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import com.javachess.client.action.CloseJFrame;
import com.javachess.client.sql.NewPlayer;


/**
*/
public class Create extends javax.swing.JFrame {
	private JPanel jPanel1;
	private JLabel jLabel3;
	private JPasswordField jPasswordField1;
	private JLabel jLabel4;
	private JPasswordField jPasswordField2;
	private JButton jButton1;
	private JButton jButton2;
	private JTextField jTextField1;
	private JLabel jLabel2;
	private JPanel jPanel3;
	private JPanel jPanel2;
	private JLabel jLabel1;

	/**
	* 
	*/
	/**public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Create inst = new Create();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				inst.setResizable(true);
				inst.setTitle("Create your account");
			}
		});
	}*/
	
	/**
	 * Constructor that displays the JFrame
	 */
	public Create() {
		super();
		initGUI();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
		this.setTitle("Create your account");
	}
	
	/**
	 * Initialises the JFrame
	 */
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jPanel1 = new JPanel();
				getContentPane().add(jPanel1, BorderLayout.NORTH);
				jPanel1.setPreferredSize(new java.awt.Dimension(684, 74));
				{
					jLabel1 = new JLabel();
					jPanel1.add(jLabel1);
					jLabel1.setText("Please fill in the fields below to create your account");
				}
			}
			{
				jPanel2 = new JPanel();
				GridBagLayout jPanel2Layout = new GridBagLayout();
				getContentPane().add(jPanel2, BorderLayout.SOUTH);
				jPanel2.setPreferredSize(new java.awt.Dimension(684, 128));
				jPanel2Layout.rowWeights = new double[] {0.1, 0.1, 0.1, 0.1};
				jPanel2Layout.rowHeights = new int[] {7, 7, 7, 7};
				jPanel2Layout.columnWeights = new double[] {0.1, 0.1, 0.1, 0.1};
				jPanel2Layout.columnWidths = new int[] {7, 7, 7, 7};
				jPanel2.setLayout(jPanel2Layout);
				{
					jButton1 = new JButton();
					jPanel2.add(jButton1, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jButton1.setText("Create!");
					jButton1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButton1ActionPerformed(evt);
						}
					});
				}
				{
					jButton2 = new JButton();
					jPanel2.add(jButton2, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jButton2.setText("Exit");
					jButton2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButton2ActionPerformed(evt);
						}
					});
				}
			}
			{
				jPanel3 = new JPanel();
				GridBagLayout jPanel3Layout = new GridBagLayout();
				getContentPane().add(jPanel3, BorderLayout.CENTER);
				jPanel3Layout.rowWeights = new double[] {0.1, 0.1, 0.1, 0.1};
				jPanel3Layout.rowHeights = new int[] {7, 7, 7, 7};
				jPanel3Layout.columnWeights = new double[] {0.1, 0.1, 0.1, 0.1};
				jPanel3Layout.columnWidths = new int[] {7, 7, 7, 7};
				jPanel3.setLayout(jPanel3Layout);
				{
					jLabel2 = new JLabel();
					jPanel3.add(jLabel2, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jLabel2.setText("Username:");
				}
				{
					jTextField1 = new JTextField();
					jPanel3.add(jTextField1, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
				}
				{
					jLabel3 = new JLabel();
					jPanel3.add(jLabel3, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jLabel3.setText("Password:");
				}
				{
					jPasswordField1 = new JPasswordField();
					jPanel3.add(jPasswordField1, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
				}
				{
					jLabel4 = new JLabel();
					jPanel3.add(jLabel4, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jLabel4.setText("Re-type password:");
				}
				{
					jPasswordField2 = new JPasswordField();
					jPanel3.add(jPasswordField2, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
				}
			}
			pack();
			setSize(700, 700);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	/**
	 * Method to handle the creation of the username and password.
	 * @param evt called when clicking on the Jbutton
	 */
	private void jButton1ActionPerformed(ActionEvent evt) {
			if (jTextField1.getText().length() == 0) {
				JOptionPane.showMessageDialog(this, "Please type a username.");
			}
			else if (jPasswordField1.getPassword().length == 0 || jPasswordField2.getPassword().length == 0){
				JOptionPane.showMessageDialog(this, "Please type a password.");
			}
			else if (Arrays.equals(jPasswordField1.getPassword(), jPasswordField2.getPassword())){
				
				String pass = new String(jPasswordField1.getPassword());
				NewPlayer np = new NewPlayer(jTextField1.getText(), pass);
				
			}
			else{
				JOptionPane.showMessageDialog(this, "Please type two identical passwords");
			}
		
	}
	
	/**
	 * Method to close the JFrame
	 * @param evt called when clicking on the Jbutton
	 */
	private void jButton2ActionPerformed(ActionEvent evt) {
		CloseJFrame cj = new CloseJFrame(this);
	}

}
