package com.javachess.server.jframe;
import java.awt.BorderLayout;
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

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;



public class Runned extends javax.swing.JFrame {
	private JPanel jPanel1;
	private JButton jButton1;
	private JButton jButton2;
	private JLabel jLabel1;
	private JPanel jPanel3;
	private JPanel jPanel2;

	
	
	public Runned(RunServer runServer) {
		super();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setTitle("Server Running");
		this.setResizable(false);
		initGUI(runServer);
	}
	
	private void initGUI(final RunServer runServer) {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jPanel1 = new JPanel();
				getContentPane().add(jPanel1, BorderLayout.NORTH);
				jPanel1.setPreferredSize(new java.awt.Dimension(384, 52));
				{
					jLabel1 = new JLabel();
					jPanel1.add(jLabel1);
					jLabel1.setText("Your server is currently running");
				}
			}
			{
				jPanel2 = new JPanel();
				getContentPane().add(jPanel2, BorderLayout.SOUTH);
				jPanel2.setPreferredSize(new java.awt.Dimension(384, 64));
			}
			{
				jPanel3 = new JPanel();
				GridBagLayout jPanel3Layout = new GridBagLayout();
				getContentPane().add(jPanel3, BorderLayout.CENTER);
				jPanel3Layout.rowWeights = new double[] {0.1, 0.1, 0.1};
				jPanel3Layout.rowHeights = new int[] {7, 7, 7};
				jPanel3Layout.columnWeights = new double[] {0.1, 0.1};
				jPanel3Layout.columnWidths = new int[] {7, 7};
				jPanel3.setLayout(jPanel3Layout);
				{
					jButton1 = new JButton();
					jPanel3.add(jButton1, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jButton1.setText("Run this in background");
					jButton1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButton1ActionPerformed(evt);
						}
					});
				}
				{
					jButton2 = new JButton();
					jPanel3.add(jButton2, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jButton2.setText("Close server");
					jButton2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButton2ActionPerformed(evt, runServer);
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
		this.setVisible(false);
	}
	
	
	private void jButton2ActionPerformed(ActionEvent evt, RunServer runServer) {
		// TODO: closing the server is not working, try another way.
		runServer.CloseServer();
		WindowEvent wev = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wev);
	}

}
