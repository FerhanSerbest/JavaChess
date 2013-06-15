/**
 * Class not done. Needs socket implementation and icon management.
 */


package com.javachess.client.jframe;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


/**
*/
public class Chess extends javax.swing.JFrame {
	private JPanel jPanel1;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JButton jButton1;
	private JLabel jLabel2;
	private JLabel jLabel1;
	private JPanel jPanel3;
	private JPanel jPanel2;
	private JLabel[][] jLabel;

	
	
	/**
	* 
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Chess inst = new Chess();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				inst.setTitle("JavaChess");
				inst.setResizable(false);
			}
		});
	}
	
	/**
	 * constructor calling the initGUI and the super constructor.
	 */
	public Chess() {
		super();
		initGUI();
	}
	
	/**
	 * initiation method for the gui
	 */
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jPanel1 = new JPanel();
				GridBagLayout jPanel1Layout = new GridBagLayout();
				getContentPane().add(jPanel1, BorderLayout.NORTH);
				jPanel1.setPreferredSize(new java.awt.Dimension(684, 76));
				jPanel1Layout.rowWeights = new double[] {0.1, 0.1};
				jPanel1Layout.rowHeights = new int[] {7, 7};
				jPanel1Layout.columnWeights = new double[] {0.1};
				jPanel1Layout.columnWidths = new int[] {7};
				jPanel1.setLayout(jPanel1Layout);
				{
					jLabel1 = new JLabel();
					jPanel1.add(jLabel1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jLabel1.setText("You are currently playing against");
				}
				{
					jButton1 = new JButton();
					jPanel1.add(jButton1, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jButton1.setText("Rules?");
					jButton1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButton1ActionPerformed(evt);
						}
					});
				}
			}
			{
				jPanel2 = new JPanel();
				GridBagLayout jPanel2Layout = new GridBagLayout();
				getContentPane().add(jPanel2, BorderLayout.SOUTH);
				jPanel2.setPreferredSize(new java.awt.Dimension(684, 48));
				jPanel2Layout.rowWeights = new double[] {0.1};
				jPanel2Layout.rowHeights = new int[] {7};
				jPanel2Layout.columnWeights = new double[] {0.1, 0.1, 0.1, 0.1};
				jPanel2Layout.columnWidths = new int[] {7, 7, 7, 7};
				jPanel2.setLayout(jPanel2Layout);
				{
					jLabel2 = new JLabel();
					jPanel2.add(jLabel2, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jLabel2.setText("You have lost x pieces");
				}
				{
					jLabel3 = new JLabel();
					jPanel2.add(jLabel3, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jLabel3.setText("Player Y has lost X pieces");
				}
			}
			{
				jPanel3 = new JPanel();
				GridBagLayout jPanel3Layout = new GridBagLayout();
				jPanel3Layout.columnWidths = new int[] {20, 20, 20, 20, 20, 20, 20, 20};
				jPanel3Layout.rowHeights = new int[] {20, 20, 20, 20, 20, 20, 20, 20};
				jPanel3Layout.columnWeights = new double[] {0, 0, 0, 0, 0, 0, 0, 0};
				jPanel3Layout.rowWeights = new double[] {0, 0, 0, 0, 0, 0, 0, 0};
				getContentPane().add(jPanel3, BorderLayout.CENTER);
				jPanel3.setLayout(jPanel3Layout);
				{
					jLabel = new JLabel[8][8];
					for (int i = 0 ; i<8 ; i++){
						for (int j = 0 ; j<8 ; j++){
							jLabel[i][j] = new JLabel();;
							jLabel[i][j].setSize(50, 50);
							if ( ((j % 2) == 0) && (( i % 2 ) == 0 )){
								java.net.URL imageURL = Chess.class.getResource("images/white.png");
								ImageIcon icon = new ImageIcon(imageURL);
								jLabel[i][j].setIcon(icon);
								
							}
							else if ((( j % 2 ) != 0) && (( i % 2 ) == 0 )){
								java.net.URL imageURL = Chess.class.getResource("images/gray.png");
								ImageIcon icon = new ImageIcon(imageURL);
								jLabel[i][j].setIcon(icon);
								//TODO: possible lead: do a function that returns a jlabel with the correct new icon and then: jlabel = new jlabel(return_of_function);
								java.net.URL imageURLl = Chess.class.getResource("images/rook.png");
								ImageIcon iconn = new ImageIcon(imageURLl);
								jLabel[i][j].setIcon(iconn);
								//
							}
							else if ((( j % 2) != 0) && (( i % 2 ) != 0)){
								java.net.URL imageURL = Chess.class.getResource("images/white.png");
								ImageIcon icon = new ImageIcon(imageURL);
								jLabel[i][j].setIcon(icon);
							}
							else {
								java.net.URL imageURL = Chess.class.getResource("images/gray.png");
								ImageIcon icon = new ImageIcon(imageURL);
								jLabel[i][j].setIcon(icon);
							}
							jPanel3.add(jLabel[i][j], new GridBagConstraints(i, j, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
						}
					}
				}
				{
					/**jLabel4 = new JLabel();
					java.net.URL imageURL = Chess.class.getResource("images/gray.jpg");
					ImageIcon icon = new ImageIcon(imageURL);
					jLabel4.setIcon(icon);
					jLabel5 = new JLabel();
					java.net.URL imageURLL = Chess.class.getResource("images/tour.jpg");
					ImageIcon iconn = new ImageIcon(imageURLL);
					jLabel5.setIcon(iconn);
					jPanel3.add(jLabel5, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jPanel3.add(jLabel4, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));

					//jLabel4.setText("jLabel4");*/
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
     * Wraps a Swing JComponent in a background image. Simply invokes the overloded
     * variant with Top/Leading alignment for background image.
     *
     * @param component - to wrap in the a background image
     * @param backgroundIcon - the background image (Icon)
     * @return the wrapping JPanel
     */
    public static JPanel wrapInBackgroundImage(JComponent component,
            Icon backgroundIcon) {
        return wrapInBackgroundImage(
                component,
                backgroundIcon,
                JLabel.TOP,
                JLabel.LEADING);
    }
    
    /**
     * Wraps a Swing JComponent in a background image. The vertical and horizontal
     * alignment of background image can be specified using the alignment
     * contants from JLabel.
     *
     * @param component - to wrap in the a background image
     * @param backgroundIcon - the background image (Icon)
     * @param verticalAlignment - vertical alignment. See contants in JLabel.
     * @param horizontalAlignment - horizontal alignment. See contants in JLabel.
     * @return the wrapping JPanel
     */
    public static JPanel wrapInBackgroundImage(JComponent component,
            Icon backgroundIcon,
            int verticalAlignment,
            int horizontalAlignment) {
        
        // make the passed in swing component transparent
        component.setOpaque(false);
        
        // create wrapper JPanel
        JPanel backgroundPanel = new JPanel(new GridBagLayout());
        
        // add the passed in swing component first to ensure that it is in front
        //backgroundPanel.add(component, gbc);
        
        // create a label to paint the background image
        JLabel backgroundImage = new JLabel(backgroundIcon);
        
        // set minimum and preferred sizes so that the size of the image
        // does not affect the layout size
        backgroundImage.setPreferredSize(new Dimension(1,1));
        backgroundImage.setMinimumSize(new Dimension(1,1));
        
        // align the image as specified.
        backgroundImage.setVerticalAlignment(verticalAlignment);
        backgroundImage.setHorizontalAlignment(horizontalAlignment);
        
        // add the background label
        //backgroundPanel.add(backgroundImage, gbc);
        
        // return the wrapper
        return backgroundPanel;
    }
    
    private void jButton1ActionPerformed(ActionEvent evt) {
    	//TODO: do a rules check.
    	JOptionPane.showMessageDialog(this, "Please type a p \n assword.");
    }
    
    private void jLabel4MouseClicked(MouseEvent evt) {
    	System.out.println("I just clicked");
    }

}
