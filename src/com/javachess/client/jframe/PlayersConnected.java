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
public class PlayersConnected extends javax.swing.JFrame {
	private JPanel jPanel1;
	private JButton jButton1;
	private JButton jButton2;
	private JLabel jLabel1;
	private JPanel jPanel3;
	private JPanel jPanel2;

	/**
	* 
	*/
	/**public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				PlayersConnected inst = new PlayersConnected();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}*/
	
	public PlayersConnected(String username, Socket socketClient) {
		super();
		initGUI(username, socketClient);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setTitle("Currently connected players");
	}
	
	private void initGUI(String username, Socket socketClient) {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jPanel1 = new JPanel();
				getContentPane().add(jPanel1, BorderLayout.NORTH);
				jPanel1.setPreferredSize(new java.awt.Dimension(684, 54));
				{
					jLabel1 = new JLabel();
					jPanel1.add(jLabel1);
					jLabel1.setText("Here are the currently connected players");
				}
			}
			{
				jPanel2 = new JPanel();
				GridBagLayout jPanel2Layout = new GridBagLayout();
				getContentPane().add(jPanel2, BorderLayout.SOUTH);
				jPanel2.setPreferredSize(new java.awt.Dimension(684, 54));
				jPanel2Layout.rowWeights = new double[] {0.1};
				jPanel2Layout.rowHeights = new int[] {7};
				jPanel2Layout.columnWeights = new double[] {0.1, 0.1};
				jPanel2Layout.columnWidths = new int[] {7, 7};
				jPanel2.setLayout(jPanel2Layout);
				{
					jButton1 = new JButton();
					jPanel2.add(jButton1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jButton1.setText("Choose");
					jButton1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButton1ActionPerformed(evt);
						}
					});
				}
				{
					jButton2 = new JButton();
					jPanel2.add(jButton2, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
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
				getContentPane().add(jPanel3, BorderLayout.CENTER);
			}
			pack();
			setSize(700, 700);
		} catch (Exception e) {
		    //TODO: error handling
			e.printStackTrace();
		}
	}
	
	private void jButton2ActionPerformed(ActionEvent evt) {
		CloseJFrame cj = new CloseJFrame(this);
	}
	
	private void jButton1ActionPerformed(ActionEvent evt) {
		System.out.println("jButton1.actionPerformed, event="+evt);
		//TODO code for action handler
	}

}
