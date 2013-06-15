package com.javachess.client.jframe;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import com.javachess.client.action.CloseJFrame;


/**

*/
public class Info extends javax.swing.JFrame {
	private JPanel jPanel1;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JButton jButton2;
	private JButton jButton1;
	private JLabel jLabel9;
	private JLabel jLabel8;
	private JLabel jLabel7;
	private JLabel jLabel6;
	private JLabel jLabel2;
	private JPanel jPanel3;
	private JPanel jPanel2;
	private JLabel jLabel1;

	
	/**
	 * Constructor that handle the JFrame initialisation. 
	 * @param username - username passed from Intro.java
	 * @param wins - wins of the user selected
	 * @param losses - losses of the user selected
	 * @param socketClient - Socket connected to Client
	 */
	public Info(String username, int wins, int losses, Socket socketClient) {
		super();
		initGUI(username, wins, losses, socketClient);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setTitle("Account Information");
		this.setResizable(false);
	}
	
	
	private void initGUI(String username, int wins, int losses, final Socket socketClient) {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jPanel1 = new JPanel();
				getContentPane().add(jPanel1, BorderLayout.NORTH);
				jPanel1.setPreferredSize(new java.awt.Dimension(684, 30));
				{
					jLabel1 = new JLabel();
					jPanel1.add(jLabel1);
					// TODO: get name of account from SQL and pass it here to JLabel1
					jLabel1.setText("Welcome . Here is your account information.");
				}
			}
			{
				jPanel2 = new JPanel();
				GridBagLayout jPanel2Layout = new GridBagLayout();
				getContentPane().add(jPanel2, BorderLayout.SOUTH);
				jPanel2.setPreferredSize(new java.awt.Dimension(684, 160));
				jPanel2Layout.rowWeights = new double[] {0.1, 0.1, 0.1, 0.1};
				jPanel2Layout.rowHeights = new int[] {7, 7, 7, 7};
				jPanel2Layout.columnWeights = new double[] {0.1, 0.1, 0.1, 0.1};
				jPanel2Layout.columnWidths = new int[] {7, 7, 7, 7};
				jPanel2.setLayout(jPanel2Layout);
				{
					jButton1 = new JButton();
					jPanel2.add(jButton1, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jButton1.setText("Find me a player!");
					jButton1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButton1ActionPerformed(evt, username, socketClient);
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
					jLabel3 = new JLabel();
					jPanel3.add(jLabel3, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jLabel3.setText(username);
				}
				{
					jLabel4 = new JLabel();
					jPanel3.add(jLabel4, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jLabel4.setText("Wins:");
				}
				{
					jLabel5 = new JLabel();
					jPanel3.add(jLabel5, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jLabel5.setText(Integer.toString(wins));
				}
				{
					jLabel6 = new JLabel();
					jPanel3.add(jLabel6, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jLabel6.setText("Losses:");
				}
				{
					jLabel7 = new JLabel();
					jPanel3.add(jLabel7, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jLabel7.setText(Integer.toString(losses));
				}
				{
					jLabel8 = new JLabel();
					jPanel3.add(jLabel8, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jLabel8.setText("Rating:");
				}
				{
					jLabel9 = new JLabel();
					jPanel3.add(jLabel9, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					/**
					 *  TODO find a rating system, perhaps just have sql resort itself via a new table 
					 *  that would sort the players en genre de "classement" puis avoir ici var=current "out of" var=max
					 *  that makes like 1 out of 1000. NAME IT RANKING PERHAPS?
					 */
					jLabel9.setText("0");
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
	 * handler method that goes to the next JFrame to show the current players
	 * @param evt - event for pushing on the JButton
	 * @param username - username of the selected user
	 * @param socketClient - Socket connected to the client
	 */
	private void jButton1ActionPerformed(ActionEvent evt, String username, Socket socketClient) {
		PlayersConnected pc = new PlayersConnected(username, socketClient);
	}
	
	private void jButton2ActionPerformed(ActionEvent evt) {
		CloseJFrame cj = new CloseJFrame(this);
	}

}
