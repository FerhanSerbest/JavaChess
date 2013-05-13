package com.javachess.server.jframe;



import java.net.*;
import java.util.List;
import java.io.*;

import javax.swing.JOptionPane;

import com.javachess.server.sql.PlayerVerification;



public class RunServer extends Thread
{
   private ServerSocket serverSocket;
   
   public RunServer(int port) throws IOException
   {
      serverSocket = new ServerSocket(port);
   }

   public void run()
   {
      while(true)
      {
         try
         {
            System.out.println("Waiting for client on port " +
            serverSocket.getLocalPort() + "...");
            //TODO get the following line to be out of the while(true) loop, otherwise it will keep on reopening the same window
            Runned r = new Runned(this);
            Socket server = serverSocket.accept();
            System.out.println("Just connected to "
                  + server.getRemoteSocketAddress());
            DataInputStream in =
                  new DataInputStream(server.getInputStream());
            DataOutputStream out =
                    new DataOutputStream(server.getOutputStream());
           // System.out.println(in.readUTF());
            
            if (in.readInt() == 1){
            	String username = in.readUTF();
            	String password = in.readUTF();
            	PlayerVerification pv = new PlayerVerification();
            	List<Integer> data = pv.VerifyPlayer(username, password);
            	if (data != null){
            		System.out.println(data.get(0));
            		System.out.println(data.get(1));
            		out.writeInt(data.get(0));
            	
            		out.writeInt(data.get(1));
            		System.out.println("tjr dans server");
            	}else{
            		// TODO: do something for wrong username or password
            	}
            	
            }
            
            out.writeUTF("Thank you for connecting to "
              + server.getLocalSocketAddress() + "\nGoodbye!");
            server.close();
         }catch(IOException e)
         {
            e.printStackTrace();
            break;
         }
      }
   }
   
   public void CloseServer(){
	   try {
		serverSocket.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   
   
   public RunServer()
   {
      int port = 4444;
      try
      {
         Thread t = new RunServer(port);
         t.start();
      }catch(IOException e)
      {
         e.printStackTrace();
      }
   }
}