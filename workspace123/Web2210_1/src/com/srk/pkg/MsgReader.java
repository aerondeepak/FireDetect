package com.srk.pkg;

import java.util.*;
//import java.applet.*;

import net.tinyos.message.*;
import net.tinyos.packet.*;
import net.tinyos.util.*;

public class MsgReader implements net.tinyos.message.MessageListener {
	
	static class Deepak implements Runnable {
		
		private final String source;

		public Deepak(String str) {
			source = str;
		}
		
		public void run() {
			Vector v = new Vector();
			System.out.println("Thread1 running");
			System.out.println("selected source = " + source);
			String className = "com.srk.pkg.OscilloscopeMsg";
			try {
				Class c = Class.forName(className);
				Object packet = c.newInstance();
				Message msg = (Message) packet;
				if (msg.amType() < 0) {
					System.err.println(className
							+ " does not have an AM type - ignored");
				} else {
					v.addElement(msg);
				}
			} catch (Exception e) {
				System.err.println(e);
			};
			
			try {
				msg = new MsgReader(source);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Enumeration msgs = v.elements();
			while (msgs.hasMoreElements()) {
				Message m = (Message) msgs.nextElement();
				msg.addMsgType(m);
				}
			} 
		}
	

	private MoteIF moteIF;
	public OscilloscopeMsg omsg;
	private static MsgReader msg;
	static Boolean counter = true;
	static String source = null;

	public MsgReader(String source) throws Exception {
		if (source != null) {
			moteIF = new MoteIF(BuildSource.makePhoenix(source,
					PrintStreamMessenger.err));
		} else {
			moteIF = new MoteIF(
					BuildSource.makePhoenix(PrintStreamMessenger.err));
		}
	}
	
	public static String getSource() {
		return source;
	}

	public static void setSource(String source) {
		MsgReader.source = source;
	}

	public static MsgReader getInstance() {
		return msg;
	}

	static {
		Vector v = new Vector();
		 Thread Thread11 = new Thread(new Deepak("sf@172.16.72.131:9003"));
		 Thread11.start();	
	}
	
	public void messageReceived(int to, Message msg) {
		if (msg instanceof OscilloscopeMsg) {
			omsg = (OscilloscopeMsg) msg;
		}
	}

	private static void usage() {
		System.err.println("usage: MsgReader [-comm <source>] message-class [message-class ...]");
	}

	private void addMsgType(Message msg) {
		moteIF.registerListener(msg, this);
	}

}