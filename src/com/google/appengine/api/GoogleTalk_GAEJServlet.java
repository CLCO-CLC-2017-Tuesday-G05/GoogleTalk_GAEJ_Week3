package com.google.appengine.api;

import java.io.IOException;
import javax.servlet.http.*;

import com.google.appengine.api.mail.MailService.Message;
import com.google.appengine.api.xmpp.JID;
import com.google.appengine.api.xmpp.XMPPService;
import com.google.appengine.api.xmpp.XMPPServiceFactory;

@SuppressWarnings("serial")
public class GoogleTalk_GAEJServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException{
			//get the incoming message from the Request object i.e. req
			// interpret it and compose a response
			//send the response message back
		XMPPService xmpp = XMPPServiceFactory.getXMPPService();
		com.google.appengine.api.xmpp.Message msg = xmpp.parseMessage(req);
		JID fromJid = msg.getFromJid();
		String body = msg.getBody();
	}
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
	
}
