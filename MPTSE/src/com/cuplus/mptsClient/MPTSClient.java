package com.cuplus.mptsClient;

import java.io.InputStream;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.io.IOUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
/**
 * @author Geetha
 *
 */
public class MPTSClient {
	private static final String String = null;
	private static final String Element = null;
	private static final String UFXMsg = null;

	/**
	 * Builds a POST REQUEST and returns Jersy's ClientResponse
	 * 
	 * @param request
	 * @return
	 * @throws RequestFailedException 
	 */
public String sendPostRequest(String request,String URL) throws RequestFailedException{
	
	ClientResponse response = null;	
	String body=null;
	try{  
		WebResource resource = Client.create().resource(URL);
		response=resource.type("text/xml").post(ClientResponse.class,request);
		
		InputStream in =response.getEntityInputStream();
		 body	 = IOUtils.toString(in);
		System.out.println("Response in XML format: "+body);
		//System.out.println("response status::"+response.getStatus());
		
		
		
	}catch(Exception e){
		throw new RequestFailedException("Exception in MPTSE Client in POST request",e);
	}
return body;
}

}
