package com.javachess.client.action;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class CloseJFrame {
	
	/**
	 * Method to close a JFrame
	 * @param JF - The JFrame to close
	 */
	public CloseJFrame(JFrame JF) {
		WindowEvent wev = new WindowEvent(JF, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wev);
	}

	

}
