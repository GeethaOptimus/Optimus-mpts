package com.cuplus.mpts;

import java.io.StringReader;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.cuplus.mptsClient.JsonUtil;
import com.cuplus.mptsClient.MPTSClient;

/**
 * @author Geetha
 *
 */
public class ActivateCard {

	public String activateCardInfo(String requestJSON) {
		System.out.println("Request callActivateCard method = "+requestJSON);
	
		try {

			
			Map<String,Object> requestArgsFromT24 = JsonUtil.parseJson(requestJSON);
			String url = (String) requestArgsFromT24.get("URL");
			String msgId = (String) requestArgsFromT24.get("msg_Id");
			String regNumber = (String) requestArgsFromT24.get("reg_number");
			System.out.println("Request JSON from CallMPTSEWS registration number= "+regNumber);
			String contractNumber = (String) requestArgsFromT24.get("contract_number");
			String objectType = (String) requestArgsFromT24.get("object_type");
			String actionType = (String) requestArgsFromT24.get("action_type");
			String contrNumber = (String) requestArgsFromT24.get("contr_number");			
			String shortName = (String) requestArgsFromT24.get("short_name");

			
			String input ="<UFXMsg xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"  msg_type=\"Application\" scheme=\"WAY4Appl\" direction=\"Rq\" version=\"2.0\">"+
					"<MsgId>"+msgId+"</MsgId>"+
					"<Source app=\"OPTXML\"/>"+
					"<MsgData>"+
					"<Application>"+
					"<RegNumber>"+regNumber+"</RegNumber>"+
					"<Institution>0022</Institution>"+
					"<ObjectType>"+objectType+"</ObjectType>"+
					"<ActionType>"+actionType+"</ActionType>"+
					"<ObjectFor>"+
					"<ContractIDT>"+
					"<ContractNumber>"+contrNumber+"</ContractNumber>"+
					"<Client>"+
					"<ClientInfo>"+
					"<ShortName>"+shortName+"</ShortName>"+
					"</ClientInfo>"+
					"</Client>"+
					"</ContractIDT>"+
					"</ObjectFor>"+
					"</Application>"+
					"</MsgData>"+
					"</UFXMsg>";
			  
			  System.out.println("Activate Card XML::"+input);
			
			  String resp_class=null;
			  String resp_text=null;
			  MPTSClient client= new MPTSClient();
			  String body=client.sendPostRequest(input,url);
			 // int statusCode=response.getStatus();
			  //System.out.println(response);
			  DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
				InputSource src = new InputSource();
				src.setCharacterStream(new StringReader(body));

				Document doc = builder.parse(src);
				NodeList nList = doc.getElementsByTagName("UFXMsg");
				
				for(int temp=0; temp<nList.getLength(); temp++){
					Node node=nList.item(temp);
					System.out.println("");
					if(node.getNodeType()==Node.ELEMENT_NODE){
						Element eElement=(Element)node;
					    resp_text=eElement.getAttribute("resp_text");
					    resp_class=eElement.getAttribute("resp_class");
						/*System.out.println("resp text: "+eElement.getAttribute("resp_text"));
						System.out.println("resp code: "+eElement.getAttribute("resp_code"));
						System.out.println("resp class: "+eElement.getAttribute("resp_class"));*/
					}
				}
			
				if(resp_class.equalsIgnoreCase("E")){
					System.out.println("Failed : HTTP error code  : "+resp_class+" resp text::"+ resp_text);
					return "-1"+ ":" +resp_text;
				}else{

					System.out.println("success : HTTP Success code : "+resp_class+" resp text::"+ resp_text);
					return "0" + ":" +resp_text;
				}
			
		} catch (Exception e) {
			e.printStackTrace();
			return "-1";
		}
		
	}

}
